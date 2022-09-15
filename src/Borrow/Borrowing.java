package Borrow;

import BookPcg.Book;
import Subscriber.Subscriber;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Borrowing {

    public Borrowing(Book borrowed_book, Subscriber borrower, LocalDate dateOfBorrowing, LocalDate returnDate) {
        this.borrowed_book = borrowed_book;
        this.borrower = borrower;
        this.dateOfBorrowing = dateOfBorrowing;
        this.returnDate = returnDate;
    }

    public Borrowing(Book borrowed_book, Subscriber borrower, LocalDate dateOfBorrowing) {
        this.borrowed_book = borrowed_book;
        this.borrower = borrower;
        this.dateOfBorrowing = dateOfBorrowing;
        this.returnDate = LocalDate.now();
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int numerOfDays() {
        int daysBetween;
        daysBetween = (int) ChronoUnit.DAYS.between(dateOfBorrowing, returnDate);
        return daysBetween;
    }

    Book borrowed_book;
    Subscriber borrower;
    LocalDate dateOfBorrowing;
    LocalDate returnDate;

    @Override
    public String toString() {

        return (borrowed_book + " " + borrower + " Date of borrowing: " + dateOfBorrowing + " Return date: " + returnDate);

    }
}
