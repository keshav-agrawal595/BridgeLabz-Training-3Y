package StaticFinalKeywords;

class Book {
    static String libraryName = "City Library";
    final String isbn;   // unique identifier
    String title, author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void display() {
        if (this instanceof Book) {
            System.out.println("Book: " + title + " by " + author + " | ISBN: " + isbn);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James", "12345");
        b1.display();
        Book.displayLibraryName();
    }
}

