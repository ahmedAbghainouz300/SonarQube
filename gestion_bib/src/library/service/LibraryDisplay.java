package library.service;

import java.util.List;
import library.model.Lendable;
import library.model.BorrowableBook;
import library.model.Book;

public class LibraryDisplay {

    public static void displayAllItems(List<Lendable> items) {
        System.out.println("=== ALL LIBRARY ITEMS ===");
        for (Lendable item : items) {
            displaySingleItem(item);
        }
        System.out.println("=========================");
    }

    public static void displayAvailableItems(List<Lendable> items) {
        System.out.println("=== AVAILABLE ITEMS ===");
        for (Lendable item : items) {
            if (!item.isBorrowed()) {
                displaySingleItem(item);
            }
        }
        System.out.println("=======================");
    }

    private static void displaySingleItem(Lendable item) {
        if (item instanceof BorrowableBook) {
            BorrowableBook book = (BorrowableBook) item;
            String status = book.isBorrowed() ? "[BORROWED]" : "[AVAILABLE]";
            System.out.println(status + " " + book.getDisplayInfo());
        } else if (item instanceof Book) {
            Book book = (Book) item;
            String status = book.isBorrowed() ? "[BORROWED]" : "[AVAILABLE]";
            System.out.println(status + " " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("[UNKNOWN ITEM TYPE]");
        }
    }
}