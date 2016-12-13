package books;

import java.util.ArrayList;
import java.util.Date;

public class Library {

	private ArrayList<LibraryBook> books;
	
	public Library()
	{
		books=new ArrayList<LibraryBook>();
	}
	
	public void add(LibraryBook book)
	{
		for(int i=0;i<books.size();i++)
		{
			if(books.get(i).getISBN()==book.getISBN())
			{
				System.out.println("Book already in the library.");
				return;
			}
		}
		
		books.add(book);
	}
	
	public void checkOutBook(String isbn,Date due,String newHolder)
	{
		for(int i=0;i<books.size();i++)
		{
			if(books.get(i).getISBN()==isbn)
			{
				if(books.get(i).getCurrentHolder()==null)
				{
					books.get(i).changeDueDate(due);
					books.get(i).changeCurrentHolder(newHolder);
				}
				else
					System.out.println("Book already checked out.");
			}
		}
	}

	public String currentHolderOfBook(String isbn)
	{
		for(int i=0;i<books.size();i++)
		{
			if(books.get(i).getISBN()==isbn)
				return books.get(i).getCurrentHolder();
		}
		
		return "NO SUCH BOOK IN THE LIBRARY";
		
	}

	public void printAllBooks()
	{
		for(int i=0;i<books.size();i++)
		{
			System.out.println((i+1)+": "+books.get(i).toString());
		}
	}
}


