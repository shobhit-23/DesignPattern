package IteratorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args)
	{
		List<Book> booksList=Arrays.asList(
				new Book("Science"),
				new Book("Math"),
				new Book("GK")
		);
		
		BookShelf library= new BookShelf(booksList);
		
		Iterator<Book> iterator= library.createIterator();
		
		System.out.println("Books in the Shelf:");
		while(iterator.hasNext())
		{
			Book book = iterator.next();
            System.out.println("- " + book.getTitle());
		}
		
	}
}
