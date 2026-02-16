package com.librarymanagement.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Member {

	private int memberId;
	private String memberName;
	 
	private Set<Book> borrowedBooks = new HashSet<>();
	
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		 
	}

	public int getMemberId() {
		return memberId;
	}

	 
	public String getMemberName() {
		return memberName;
	}

	 

	public Set<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	 

	public void addBook(Book book) {
		borrowedBooks.add(book);
		
	}
	
	public void removeBook(Book book) {
		borrowedBooks.remove(book);
	}
	@Override
	public int hashCode() {
		return Objects.hash(memberId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return memberId == other.memberId;
	}

	@Override
	public String toString() {
		 
		return memberId+ " "+memberName+ " "+borrowedBooks;
	}
	
	
	
}
