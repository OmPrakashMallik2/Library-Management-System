public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    public String toString() {
        // return "Book [title: " + title + " Author: " + author + "]";
        return "Book [title=" + title + ", author=" + author + "]";
    }
}