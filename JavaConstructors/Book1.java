// Book Library System
class Book1 {
    public String ISBN;
    protected String title;
    private String author;

    Book1(String i, String t, String a) {
        ISBN = i;
        title = t;
        author = a;
    }

    // getter and setter for private author
    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }

    void showBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

// subclass accessing public and protected members
class EBook extends Book1 {
    String format;

    EBook(String i, String t, String a, String f) {
        super(i, t, a);
        format = f;
    }

    void showEBook() {
        System.out.println("E-Book: " + title + " (" + ISBN + "), Format: " + format);
    }

    public static void main(String[] args) {
        EBook eb = new EBook("12345", "Java Programming", "James", "PDF");
        eb.showBook();
        eb.showEBook();
        eb.setAuthor("James Gosling");
        System.out.println("Updated Author: " + eb.getAuthor());
    }
}
