
public class main {
	public static void main(String args[]){
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("java perfect"));
		bookShelf.appendBook(new Book("ruby perfect"));
		bookShelf.appendBook(new Book("c perfect"));
		bookShelf.appendBook(new Book("c++ perfect"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
