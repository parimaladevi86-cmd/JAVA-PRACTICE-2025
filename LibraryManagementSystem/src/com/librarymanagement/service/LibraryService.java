package com.librarymanagement.service;

import java.util.Map;
import java.util.Set;

import com.librarymanagement.model.Book;
import com.librarymanagement.model.Member;
import com.librarymanagement.repository.BookRepository;
import com.librarymanagement.repository.MemberRepository;

public class LibraryService {

	private BookRepository bookRepository;
	private MemberRepository memberRepository;
	
	public LibraryService(BookRepository bookRepository, MemberRepository memberRepository) {
		super();
		this.bookRepository = bookRepository;
		this.memberRepository = memberRepository;
	}
	
	 
	
	
	public void addBook(Book book) {
		bookRepository.addBook(book);
		 
	}

	public void addMember(Member member) {
		memberRepository.addMember(member);
	}

	public Set<Book> getAllBooks() {
		return bookRepository.getAllBooks();
	}

	public Map<Integer,Member> getAllMembers() {
		return memberRepository.getAllMembers();
	}
	
	public void issueBook(int memberId, int bookId) {
		Member member = memberRepository.findMemberById(memberId);
		Book book = bookRepository.findBookById(bookId);
		if (member == null || book == null){
			return;
		}
		if(book.isAvailable()==false) {
			return;
		}
		book.setAvailable(false);
		member.addBook(book);
	}

	public void returnBook(int memberId, int bookId) {
		Member member = memberRepository.findMemberById(memberId);
		Book book = bookRepository.findBookById(bookId);
		if (member == null || book == null){
			return;
		}
		if(member.getBorrowedBooks().contains(book)) {
			 return;
		}
		member.removeBook(book);
		book.setAvailable(true);
	}

	
	
	
}
