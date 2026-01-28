import java.util.Scanner;

public class LibrarySystem {

    static Book[] books = new Book[100];
    static int count = 0;
    static ActivityStack activity = new ActivityStack();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("""
            1. Add Book
            2. Remove Book
            3. Update Book
            4. Search Book
            5. Sort Books
            6. Borrow Book
            7. View Activities
            8. Exit
            """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 -> updateBook();
                case 4 -> searchBook();
                case 5 -> sortBooks();
                case 6 -> borrowBook();
                case 7 -> activity.display();
                case 8 -> System.exit(0);
            }
        }
    }

    static void addBook() {
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Genre: ");
        String genre = sc.nextLine();

        books[count++] = new Book(title, author, isbn, year, genre);
        activity.push("Added book: " + title);
    }

    static void removeBook() {
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                books[i] = books[count - 1];
                count--;
                activity.push("Removed book ISBN: " + isbn);
                return;
            }
        }
    }

    static void updateBook() {
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                System.out.print("New title: ");
                books[i].setTitle(sc.nextLine());
                System.out.print("New author: ");
                books[i].setAuthor(sc.nextLine());
                activity.push("Updated book ISBN: " + isbn);
                return;
            }
        }
    }

    static void searchBook() {
        System.out.print("Keyword: ");
        String key = sc.nextLine();
        int index = SearchUtils.linearSearch(books, count, key);
        System.out.println(index >= 0 ? books[index] : "Not found");
        activity.push("Search: " + key);
    }

    static void sortBooks() {
        System.out.println("1. Bubble (Title)\n2. Selection (Year)\n3. Quick (Author)");
        int c = sc.nextInt();
        if (c == 1) SortUtils.bubbleSortByTitle(books, count);
        else if (c == 2) SortUtils.selectionSortByYear(books, count);
        else SortUtils.quickSortByAuthor(books, 0, count - 1);
    }

    static void borrowBook() {
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                System.out.print("Borrower name: ");
                String name = sc.nextLine();
                books[i].getHistory().addBorrower(name);
                activity.push("Borrowed book: " + isbn);
            }
        }
    }
}
