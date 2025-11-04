package library.service;

import library.model.Lendable;
import library.model.BorrowableBook;
import library.model.Book;

public class ItemFormatter {

    public static String formatForDisplay(Lendable item) {
        if (item instanceof BorrowableBook) {
            BorrowableBook book = (BorrowableBook) item;
            return book.getDisplayInfo() + " - " + getBorrowStatus(book);
        } else if (item instanceof Book) {
            Book book = (Book) item;
            return book.getTitle() + " by " + book.getAuthor() + " - " + getBorrowStatus(book);
        } else {
            return "Unknown item type";
        }
    }

    private static String getBorrowStatus(Lendable item) {
        return item.isBorrowed() ? "BORROWED" : "AVAILABLE";
    }
}