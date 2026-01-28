public class SearchUtils {

    public static int linearSearch(Book[] books, int size, String key) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(key) ||
                books[i].getAuthor().equalsIgnoreCase(key) ||
                books[i].getIsbn().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchByTitle(Book[] books, int size, String title) {
        int left = 0, right = size - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);
            if (cmp == 0) return mid;
            if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
