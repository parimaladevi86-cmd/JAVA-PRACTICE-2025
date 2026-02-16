package com.librarymanagement.model;

import java.util.Objects;

public class Book {
	 
	
	private int bookId;
	private String bookName;
	private String author;
	private boolean available= true;
	
	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		 
	}

	public int getBookId() {
		return bookId;
	}

	 

	public String getBookName() {
		return bookName;
	}

	 

	public String getAuthor() {
		return author;
	}

	 

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bookId == other.bookId;
	}

	@Override
	public String toString() {
		
		return bookId+" "+bookName+" "+author+" "+available;
	}
	
	
   
}
