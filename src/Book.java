public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;
    private String genre;
    private BorrowingHistory history = new BorrowingHistory();

    public Book(String title, String author, String isbn, int year, String genre) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = year;
        this.genre = genre;
    }

    // Getters & setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public int getPublicationYear() { return publicationYear; }

    public BorrowingHistory getHistory() { return history; }

    @Override
    public String toString() {
        return title + " | " + author + " | " + publicationYear + " | ISBN: " + isbn;
    }
}
