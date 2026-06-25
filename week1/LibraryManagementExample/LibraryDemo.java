package LibraryManagementExample;

public class LibraryDemo {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "Java Basics", "Alice"),
                new Book(2, "Data Structures", "Bob"),
                new Book(3, "Algorithms", "Carol"),
                new Book(4, "Operating Systems", "David")
        };

        String searchTitle = "Algorithms";

        int linearIndex = BookSearch.linearSearch(books, searchTitle);
        int binaryIndex = BookSearch.binarySearch(books, searchTitle);

        System.out.println("Linear search result index: " + linearIndex);
        System.out.println("Binary search result index: " + binaryIndex);
    }
}
