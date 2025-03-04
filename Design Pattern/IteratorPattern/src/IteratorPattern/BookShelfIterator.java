package IteratorPattern;

import java.util.List;

class BookShelfIterator implements Iterator<Book> {
    private int index;
    private List<Book> books;
    
    public BookShelfIterator(List<Book> books) {
		this.books=books;
	}
    
    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Book next() {
        if (this.hasNext()) {
            return books.get(index++);
        }
        return null;
    }
}