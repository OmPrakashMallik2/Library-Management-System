public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("Build don't talk", "Raj shomani");
        Book book2 = new Book("12 rules for life", "R.J. Peterson");

        Library l1 = new Library();
        l1.addBook(book1);
        l1.addBook(book2);

        l1.displayBooks();
    }
}
