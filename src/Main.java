import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Library library = new Library();

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                    Welcome to the spooky Library, where countless tales await your discovery!
                    Feel the allure of riveting stories, but be wary, one book veils in sinister secret...
                    
                    The whispers caution those who dare to approach 'The Haunted Mansion'.
                    Dive into adventures, but tread carefully around that one ominous volume.
                    
                    Happy reading dear visitor!
                    """);

        while (true) {

            System.out.println("""
                    Choose what you want to do, but choose carefully...
                    
                    1. Add a book to the library.
                    2. Search for a book.
                    3. List all available books.
                    4. Borrow a book.
                    5. Return a book.
                    6. Leave the library.
                    """);

            int userChoice = sc.nextInt();
            sc.nextLine();

            switch (userChoice) {
                case 1 -> {
                    System.out.println("Enter the books titel: ");
                    String bookTitel = sc.nextLine();
                    System.out.println("Enter the name of the author: ");
                    String authorName = sc.nextLine();
                    System.out.println("Enter the year it was published: ");
                    String yearPublished = sc.nextLine();

                    System.out.println("Enter the edition: ");
                    String bookEdition = sc.nextLine();
                    boolean isBookAvailable = true;
                    library.addBook(new Book(bookTitel, authorName, bookEdition, yearPublished, isBookAvailable));
                }
                case 2 -> {
                    System.out.println("Enter the titel you want to search for: ");
                    String searchTitel = sc.nextLine();
                    library.searchBook(searchTitel);
                }
                case 3 -> {
                    library.listAvailableBooks();
                }
                case 4 -> {
                    System.out.println("Enter the book titel you want to borrow: ");
                    String borrowBook = sc.nextLine();
                    library.borrowBook(borrowBook);

                }
                case 5 -> {
                    System.out.println("Enter the book titel to return: ");
                    String returnBook = sc.nextLine();
                    library.returnBook(returnBook);
                }
                case 6 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }

        }
    }
}
