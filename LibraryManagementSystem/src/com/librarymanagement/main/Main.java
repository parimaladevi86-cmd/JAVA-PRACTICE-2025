package com.librarymanagement.main;

import com.librarymanagement.model.Book;
import com.librarymanagement.model.Member;
import com.librarymanagement.repository.BookRepository;
import com.librarymanagement.repository.MemberRepository;
import com.librarymanagement.service.LibraryService;

public class Main {
	
	public static void main(String[] args) {
	BookRepository bookrepo = new BookRepository();
	MemberRepository memberrepo = new MemberRepository();
	LibraryService libservice= new LibraryService(bookrepo, memberrepo);
	Book Book1 = new Book(10, "JAVA", "Balagurusamy");
	Book Book2 = new Book(20, "Python", "Kishore");
	Book Book3 = new Book(30, "C++", "Durai");
	libservice.addBook(Book1);
	libservice.addBook(Book2);
	libservice.addBook(Book3);
	Member member1 = new Member(101, "Mala");
	Member member2 = new Member(102, "Sridevi");
	Member member3 = new Member(103, "Lekhasri");
	Member member4 = new Member(104, "Aarthy");
	libservice.addMember(member1);
	libservice.addMember(member2);
	libservice.addMember(member3);
	libservice.addMember(member4);
	libservice.issueBook(104, 20);
	System.out.println("All Books");
	System.out.println(libservice.getAllBooks());
	System.out.println("All Members");
	System.out.println(libservice.getAllMembers());
	
	
	
	}
}
