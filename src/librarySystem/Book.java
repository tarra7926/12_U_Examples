/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package librarySystem;

import java.util.Calendar;
import java.util.Date;

/**
 * Represents a single library book used in the library management system
 * @author tarra7926
 */
public class Book {

    private long isbn;
    private String title;
    private String author;
    private boolean onLoan;
    private Date returnDate;
    private LibraryMember borrowing;

    /**
     * Makes a book using isbn number, title, and author
     * @param isbn this isbn number of the book
     * @param title this is the title of the book
     * @param author this is the author of the book
     */
    
    
    public Book(long isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.onLoan = false;
        returnDate = null;
        this.borrowing = null;
    }
    
    
    /**
     * returns the title of the book
     * @return a string representing the title of the book
     */

    public String getTitle() {
        return this.title;
    }
    
    /**
     * returns the author of the book
     * @return a string representing the books author
     */

    public String getAuthor() {
        return this.author;
    }

    
    /**
     * returns the isbn number of the book
     * @return an integer representing the isbn number of the book
     */
    
    public long getISBN() {
        return this.isbn;
    }
    
    /**
     * returns whether the book is currently in the library or not
     * @return returns true if the book is currently on loan false if it is in the library
     */

    public boolean isOnLoan() {
        return this.onLoan;
    }

    /**
     * returning the library member who is currently borrowing the book
     * @return a library member who is currently in the possesion of the book
     */
    
    public LibraryMember whereIsIt() {
        return this.borrowing;
    }

    /**
     * returns when the loaned book is due back at the library
     * @return the date the book should be returned by
     */
    
    public Date getReturnDate() {
        return this.returnDate;
    }

    /**
     * Checks the borrowed book back into the library
     */
    
    public void checkIn() {
        this.onLoan = false;
        this.borrowing = null;
        this.returnDate = null;
    }
    
    /**
     * checks out a book to the specific library member
     * @param member the library member who is checking out the book
     */
    
    public void checkOut(LibraryMember member){
        this.borrowing = member;
        this.onLoan = true;
        //use a calendar to  set a darte two weeks in the future
        Calendar c = Calendar.getInstance();
        //seting the date to the current date
        c.setTimeInMillis(System.currentTimeMillis());
        c.add(Calendar.WEEK_OF_YEAR, 2);
        //set the return date
        this.returnDate = c.getTime();
    }
}
