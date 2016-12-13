package books;

import java.util.Date;


public class LibraryBook implements Book{

	public  String author;
	public  String title;
	public  String isbn;
	private Date dueDate;
	private String currentHolder;
	
	public LibraryBook(String isbn)
	{
		this.isbn=isbn;
		this.title=null;
		this.author=null;
		this.dueDate=null;
		this.currentHolder=null;
	}
	
	public LibraryBook(String isbn,String title, String author)
	{
		this(isbn);
		this.title=title;
		this.author=author;
		this.dueDate=null;
		this.currentHolder=null;
	}
	public LibraryBook(String isbn,String title, String author,Date due,String current)
	{
		this(isbn,title,author);
		this.dueDate=due;
		this.currentHolder=current;
	}

	
	@Override
	public String getISBN() {	
		return this.isbn;
	}

	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public String getTitle() {
		return title;
	}
	public Date getDueDate()
	{
		return this.dueDate;
	}
	public String getCurrentHolder()
	{
		return this.currentHolder;
	}
	public void changeDueDate(Date d)
	{
		this.dueDate=d;
	}
	public void changeCurrentHolder(String newHolder)
	{
		this.currentHolder=newHolder;
	}
	public String toString()
	{
		String str="\""+getTitle()+"\""+", "+getAuthor()+", "+getISBN();
		
		if(getDueDate()!=null && getCurrentHolder()!=null)
			str+="("+getDueDate()+", "+getCurrentHolder()+")";
		
		return str;
	}
	

	public boolean equals(LibraryBook b) 
	{

		if( (this.isbn).equals(b.isbn) )
			return true;
			
		return false;
	}

	
}
