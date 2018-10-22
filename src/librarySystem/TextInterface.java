package librarySystem;

import java.util.Scanner;

/**
 *
 * @author tarra7926
 */
public class TextInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Library library = new Library("Books");

        while (true) {
            System.out.println("Main Menu");
            System.out.println("1 - add a book");
            System.out.println("2 - add member");
            System.out.println("3 - find book by isbn");
            System.out.println("4 - find all books by author");
            System.out.println("5 - find book by title");
            System.out.println("0 - Exit");

            int choice = input.nextInt();
            //get rid of new line
            input.nextLine();

            if (choice == 0) {
                library.saveBookFile("Books");
                System.exit(0);
            } else if (choice == 1) {
                System.out.println("Please enter the ISBN");
                long isbn = input.nextLong();
                input.nextLine();
                System.out.println("Please enter the title");
                String title = input.nextLine();
                System.out.println("Please enter the author");
                String author = input.nextLine();
                library.addBook(isbn, title, author);
            } else if (choice == 2) {
            } else if (choice == 3) {
                System.out.println("Enter the ISBN");
                long isbn = input.nextLong();
                input.nextLine();
                Book b = library.findBook(isbn);
                if (b != null) {
                    System.out.println(b.getTitle() + " by " + b.getAuthor());
                } else {
                    System.out.println("No book found");
                }
            }
        }
    }
}
