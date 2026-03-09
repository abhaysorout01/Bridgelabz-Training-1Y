package com.gla.JavaPackages.library.transactions;

import com.gla.JavaPackages.library.books.Book;
import com.gla.JavaPackages.library.members.Member;

import java.time.LocalDate;

public class Transaction {

    private Member member;
    private Book book;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Transaction(Member member, Book book, LocalDate issueDate) {
        this.member = member;
        this.book = book;
        this.issueDate = issueDate;
    }

    public void returnBook(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void displayTransactionDetails() {
        System.out.println("Transaction Details:");
        member.displayMemberDetails();
        book.displayBookDetails();
        System.out.println("Issue Date: "+issueDate);
        System.out.println("Return Date: "+(returnDate != null ? returnDate : "Not Returned Yet"));
    }
}