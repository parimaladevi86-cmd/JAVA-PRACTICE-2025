package com.librarymanagement.repository;

import java.util.HashSet;
import java.util.Set;

import com.librarymanagement.model.Book;

public class BookRepository {

	private Set<Book> books = new HashSet<>();

	public void addBook(Book b) {

		books.add(b);
	}

	public Book findBookById(int bookId) {
		for (Book book : books) {
			if (book.getBookId() == bookId)
				return book;
		}
		return null;
	}

	public Set<Book> getAllBooks() {
		return books;
	}

	public void removeBook(Book b) {
		books.remove(b);
	}

}
