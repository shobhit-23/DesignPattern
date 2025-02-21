package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate<Book>{

	private List<Book> books;
	
	public BookShelf(List<Book> books)
	{
		this.books=books;
	}
		
	public void addBook(Book book)
	{
		books.add(book);
	}

	@Override
	public Iterator<Book> createIterator() {
		
		return new BookShelfIterator(books);
	}
	
}
