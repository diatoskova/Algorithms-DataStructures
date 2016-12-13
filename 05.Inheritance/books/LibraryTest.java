package books;

import java.util.Date;


public class LibraryTest {

	public static void main(String[] args) {
		
		
		Library lib=new Library();
		
		lib.add(new LibraryBook("55","Some book title","some author"));
		lib.add(new LibraryBook("66","Some book title222","some author222"));
		lib.add(new LibraryBook("77","Some book title3333","some author333"));
		
		lib.printAllBooks();
		
		lib.checkOutBook("55", new Date(), "John Johnes");
		
		lib.printAllBooks();

	}

}
