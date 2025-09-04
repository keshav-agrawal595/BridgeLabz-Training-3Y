// Library Book System with borrow method
class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String t, String a, double p, boolean av) {
        title = t;
        author = a;
        price = p;
        available = av;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You borrowed: " + title);
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public static void main(String[] args) {
        LibraryBook lb1 = new LibraryBook("GenAI Programming", "Keshav", 250, true);
        lb1.borrowBook();
        lb1.borrowBook();
    }
}
