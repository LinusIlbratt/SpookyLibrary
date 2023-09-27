
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Library {
    private List<Book> books; // Creates a list called 'books' that can maintain several objects of the type 'Book'. 'Book' is a blueprint to create more book objects.


    public Library(){ // Constructor that creates a new instance of the class when you use 'new SpookyLibrary()'
        this.books = new ArrayList<>(); // Initiate the 'books' variable to a new instance of the class 'ArrayList' 'ArrayList' is an implementation of the interface 'List'
        books.add(new Book("Haunted Mansion", "Unkown", "Unkown", 1431, true));
    }

    public void addBook(Book book) { // Method declaration. It is public, so it can be called from other classes.
        books.add(book); // Within the method we call the add function
    }

    public void searchBook(String titel){
        for (Book book : books) {
            if (book.getBookTitel().equalsIgnoreCase(titel))
            {
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
        boolean bookFound = false;
        for (Book book : books) {
            if (book.getBookTitel().equalsIgnoreCase(title)) {
                bookFound = true;

                // If the book is "Haunted Mansion", start the game
                if (title.equalsIgnoreCase("Haunted Mansion")){
                    HauntedMansionGame game = new HauntedMansionGame();
                    game.start();
                    return; // When the game is over, exit the method.
                }
                if (book.isBookAvailable()) {
                    book.borrowBook();
                    System.out.println("You have borrowed " + title + " enjoy!");
                } else {
                    System.out.println("The book " + title + " is currently not available");
                }
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Im sorry " + title + " doesn't exist in our library at the moment.");
        }
    }
    public void returnBook(String titel){
        for (Book book : books) {
            if (book.getBookTitel().equalsIgnoreCase(titel)) {
                book.returnBook();
                System.out.println("The book was returned successfully.");
                break;
            }
        }
    }
}