package Inheritance.SingleInheritance;

class Book {
    String title;
    int publicationYear;

    Book(String title, int year) {
        this.title = title;
        this.publicationYear = year;
    }

    void displayInfo() {
        System.out.println("Book: " + title + ", Published in: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Author a = new Author("Java Basics", 2025, "James Gosling", "Creator of Java language");
        a.displayInfo();
    }
}
