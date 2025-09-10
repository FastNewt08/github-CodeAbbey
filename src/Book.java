class LibraryBook {
    // Fields (encapsulated)
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable = true; // default: true

    // Static feature
    private static int totalBooksCreated = 0;

    // Parameterized constructor
    public LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooksCreated++; // increment static count
    }

    // Method: checkOut
    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    // Method: returnBook
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not checked out.");
        }
    }

    // Method: displayInfo
    public void displayInfo() {
        System.out.println("----- Book Info -----");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("----------------------");
    }

    // Getter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Static getter for total books
    public static int getTotalBooks() {
        return totalBooksCreated;
    }
}
public class Book {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("1984", "George Orwell", "123456789");
        LibraryBook book2 = new LibraryBook("The Hobbit", "J.R.R. Tolkien", "987654321");

        book1.displayInfo();
        book2.displayInfo();

        book1.checkOut();
        book1.checkOut(); // trying again

        book1.returnBook();
        book1.returnBook(); // trying again

        System.out.println("Total books created: " + LibraryBook.getTotalBooks());
    }
}
