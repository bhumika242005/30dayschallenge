class Book {
    String title, author;
    boolean isAvailable;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void returnBook() {
        isAvailable = true;
        System.out.println(title + " returned successfully.");
    }
}

public class day21 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        b1.borrowBook();
        b1.returnBook();
        b1.borrowBook();
    }
}
