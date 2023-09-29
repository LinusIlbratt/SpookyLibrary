
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books; // Creates a list called 'books' that can maintain several objects of the type 'Book'. 'Book' is a blueprint to create more book objects.


    public Library() { // Constructor that creates a new instance of the class when you use 'new SpookyLibrary()'
        this.books = new ArrayList<>(); // Initiate the 'books' variable to a new instance of the class 'ArrayList' 'ArrayList' is an implementation of the interface 'List'
        books.add(new Book("Haunted Mansion", "Unknown", "Unknown", "Unknown", true));
    }

    public void addBook(Book book) { // Method declaration. It is public, so it can be called from other classes.
        books.add(book); // Within the method we call the add function
    }

    public void searchBook(String titel) {
        for (Book book : books) {
            if (book.getBookTitel().equalsIgnoreCase(titel)) {
                System.out.println(book.toString());
            }
        }
    }

    public void listAvailableBooks() {
        for (Book book : books) {
            if (book.isBookAvailable()) {
                System.out.println(book.toString());
            }
        }
    }

    public void borrowBook(String title) {

        Book foundBook = findBookByTitle(title);
        if (foundBook != null) {
            // Check if book is available first
            if (foundBook.isBookAvailable()) {
                // If the books is "Haunted Mansion" start the game
                if (title.equalsIgnoreCase("Haunted Mansion")) {
                    HauntedMansionGame game = new HauntedMansionGame();
                    game.start(); // Continue with the code after the game is over
                }

                foundBook.borrowBook();
                System.out.println("You have borrowed " + title + " enjoy!");
            } else {
                System.out.println("The book " + title + " is currently not available");
            }
        } else {
            System.out.println("I'm sorry " + title + " doesn't exist in our library at the moment.");
        }

    }

    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getBookTitel().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }


    public void returnBook(String titel) {
        for (Book book : books) {
            if (book.getBookTitel().equalsIgnoreCase(titel)) {
                book.returnBook();
                System.out.println("The book was returned successfully.");
                break;
            }
        }
    }
}