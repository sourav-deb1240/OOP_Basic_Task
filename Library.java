import java.util.*;
class Book {
    String title, author, ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public String toString() {
        return title + " by " + author + ", ISBN: " + ISBN;
    }
}
class Library {
    private ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }
    void removeBook(Book b) {
        books.remove(b);
    }
    void showBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        System.out.println("Q5:");
        Library lib = new Library();
        Book b1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book b2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
        lib.addBook(b1);
        lib.addBook(b2);
        System.out.println("List of books:");
        lib.showBooks();
        lib.removeBook(b1);
        System.out.println("After removing The C Programming Language:");
        System.out.println("List of books:");
        lib.showBooks();
    }
}
