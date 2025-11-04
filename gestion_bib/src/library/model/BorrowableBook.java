package library.model;

public class BorrowableBook implements Lendable {
    private BookInfo bookInfo;
    private boolean borrowed;

    public BorrowableBook(String title, String author) {
        this.bookInfo = new BookInfo(title, author);
        this.borrowed = false;
    }

    // ✅ Responsabilité unique : gestion emprunt avec données livre
    @Override
    public void borrow() {
        if (!borrowed) {
            borrowed = true;
        } else {
            System.out.println("Book '" + bookInfo.getTitle() + "' is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
        } else {
            System.out.println("Book '" + bookInfo.getTitle() + "' was not borrowed.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    // Délégation à BookInfo
    public String getTitle() { return bookInfo.getTitle(); }
    public String getAuthor() { return bookInfo.getAuthor(); }
    public String getDisplayInfo() { return bookInfo.getDisplayInfo(); }
}