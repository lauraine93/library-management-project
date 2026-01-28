public class SortUtils {

    public static void bubbleSortByTitle(Book[] b, int n) {
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (b[j].getTitle().compareToIgnoreCase(b[j+1].getTitle()) > 0)
                    swap(b, j, j+1);
    }

    public static void selectionSortByYear(Book[] b, int n) {
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++)
                if (b[j].getPublicationYear() < b[min].getPublicationYear())
                    min = j;
            swap(b, i, min);
        }
    }

    public static void quickSortByAuthor(Book[] b, int low, int high) {
        if (low < high) {
            int p = partition(b, low, high);
            quickSortByAuthor(b, low, p - 1);
            quickSortByAuthor(b, p + 1, high);
        }
    }

    private static int partition(Book[] b, int low, int high) {
        String pivot = b[high].getAuthor();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (b[j].getAuthor().compareToIgnoreCase(pivot) < 0) {
                i++;
                swap(b, i, j);
            }
        }
        swap(b, i + 1, high);
        return i + 1;
    }

    private static void swap(Book[] b, int i, int j) {
        Book temp = b[i];
        b[i] = b[j];
        b[j] = temp;
    }
}
