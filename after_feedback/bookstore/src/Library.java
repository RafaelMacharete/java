import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findByIsbn(int isbn) {
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        return null;
    }

    public boolean borrowBook(int isbn) {
        Book book = findByIsbn(isbn);
        if (book != null && !book.isBorrowed()) {
            book.borrow();
            return true;
        }
        return false;
    }

    public boolean returnBook(int isbn) {
        Book book = findByIsbn(isbn);
        if (book != null && book.isBorrowed()) {
            book.returnBook();
            return true;
        }
        return false;
    }

    public void listBooks(boolean onlyAvailable) {
        for (Book book : books) {
            if (onlyAvailable && !book.isBorrowed()) {
                System.out.println(book);
            } else if (!onlyAvailable && book.isBorrowed()) {
                System.out.println(book);
            }
        }
    }

    public void searchBooks(String keyword) {
        keyword = keyword.toLowerCase();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword) ||
                    book.getAuthor().toLowerCase().contains(keyword)) {
                System.out.println(book);
            }
        }
    }
}
