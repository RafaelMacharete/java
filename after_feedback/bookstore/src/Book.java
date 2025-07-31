public class Book {
    private int isbn;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isBorrowed = false; // começa como disponível
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }




}
