package LibraryManagementExample;

import java.util.Arrays;
import java.util.Comparator;

public class BookSearch {
    public static int linearSearch(Book[] books, String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Book[] books, String title) {
        Book[] sortedBooks = Arrays.copyOf(books, books.length);
        Arrays.sort(sortedBooks, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));

        int left = 0;
        int right = sortedBooks.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = sortedBooks[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return findIndexInOriginal(books, sortedBooks[mid].getBookId());
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static int findIndexInOriginal(Book[] books, int bookId) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookId() == bookId) {
                return i;
            }
        }
        return -1;
    }
}
