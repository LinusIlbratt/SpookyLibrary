public class Book {

    // Instance variables for the book properties
    private String bookTitel;
    private String authorName;
    private String bookEdition;
    private int yearPublished;
    private boolean isBookAvailable;

    //
    public Book(String bookTitel, String authorName, String bookEdition, int yearPublished, boolean isBookAvailable){
        this.bookTitel = bookTitel;
        this.authorName = authorName;
        this.bookEdition = bookEdition;
        this.yearPublished = yearPublished;
        this.isBookAvailable = isBookAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook(){
        if (isBookAvailable){
            isBookAvailable = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean returnBook(){
        if (!isBookAvailable){
            isBookAvailable = true;
            return  true;
        } else {
            return false;
        }
    }

    public String getBookTitel() {
        return bookTitel;
    }

    public void setBookTitel(String bookTitel) {
        this.bookTitel = bookTitel;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(String bookEdition) {
        this.bookEdition = bookEdition;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isBookAvailable() {
        return isBookAvailable;
    }

    public void setBookAvailable(boolean bookAvailable) {
        isBookAvailable = bookAvailable;
    }


    public String toString(){
        return "Bok{" +
                "Titel='" + bookTitel + '\'' +
                ", Författare='" + authorName + '\'' +
                ", Utgivningsår=" + yearPublished +
                ", Upplaga='" + bookEdition + '\'' +
                ", Status=" + isBookAvailable +
                '}';
    }
}
