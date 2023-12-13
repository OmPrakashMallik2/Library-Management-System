import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    Library() {
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added : " + book.getTitle());
    }

    void displayBooks() {
        System.out.println("Books in the Library");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
