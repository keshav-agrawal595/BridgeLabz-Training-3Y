package ObjectModelling.AssistedProblems;

import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBook() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book b) {
        books.add(b);
    }

    void showLibraryBooks() {
        System.out.println("Books in " + name + " library:");
        for (Book b : books) {
            b.showBook();
        }
        System.out.println();
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("Python Crash", "Guido");

        Library lib1 = new Library("Central");
        Library lib2 = new Library("Community");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); // same book added to another library

        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}
