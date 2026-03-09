package com.gla.JavaPackages.library;
import java.time.LocalDate;
import com.gla.JavaPackages.library.books.Book;
import com.gla.JavaPackages.library.members.Member;
import com.gla.JavaPackages.library.transactions.Transaction;

public class LibraryApp {

    public static void main(String[] args) {

        // 1. Adding a new book
        Book newBook = new Book("Data Structures","Seymour Lipschutz","ISBN101");
        System.out.println("--- New Book Added ---");
        newBook.displayBookDetails();

        System.out.println();

        // 2. Registering a new member
        Member newMember = new Member("Rahul",1001);
        System.out.println("--- New Member Registered ---");
        newMember.displayMemberDetails();

        System.out.println();

        // 3. Issuing a book to a member
        Transaction issue = new Transaction(newMember,newBook,LocalDate.now());
        System.out.println("--- Book Issued ---");
        issue.displayTransactionDetails();
    }
}