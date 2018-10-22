/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package librarySystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tarra7926
 */
public class Library {

    private ArrayList<Book> books;
    private ArrayList<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public Library(String bookFile) {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File(bookFile));
            //while there are still books to scan
            while(input.hasNext()){
                String line = input.nextLine();
                String[] bookInfo = line.split(",");
                long isbn =  Long.parseLong(bookInfo[0]);
                String title = bookInfo[1];
                String author = bookInfo[2];
                Book b = new Book(isbn, title, author);
                this.books.add(b);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Book findBook(long isbn) {
        for (int i = 0; i < this.books.size(); i++) {
            Book b = this.books.get(i);
            if (b.getISBN() == isbn) {
                return b;
            }
        }
        return null;
    }

    public ArrayList<Book> findBooks(String author) {
        ArrayList<Book> listOfBooks = new ArrayList<>();
        for (Book b : this.books) {
            if (b.getAuthor().equals(author)) {
                listOfBooks.add(b);
            }
        }
        return listOfBooks;
    }

    public void addBook(long isbn, String title, String author) {
        Book b = new Book(isbn, title, author);
        this.books.add(b);

    }
    
    public void saveBookFile(String file){
        try {
            PrintWriter output = new PrintWriter(new File(file));
            
            for(Book b: this.books){
                long isbn = b.getISBN();
                String title = b.getTitle();
                String author = b.getAuthor();
                output.println(isbn + "," + title + "," + author);
            }
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
