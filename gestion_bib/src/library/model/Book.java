package library.model;

public class Book implements Lendable {
    private BookInfo bookInfo;
    private boolean borrowed;

    public Book(String title, String author) {
        this.bookInfo = new BookInfo(title, author);
        this.borrowed = false;
    }

    // Garder l'interface originale
    @Override
    public void borrow() {
        if (!borrowed) {
            borrowed = true;
        } else {
            System.out.println("This book is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

    public String getTitle() { return bookInfo.getTitle(); }
    public String getAuthor() { return bookInfo.getAuthor(); }
    public boolean isBorrowed() { return borrowed; }

    // Méthode complexe SI nécessaire
    public void complexMethodExample(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else if (i % 3 == 0) {
                System.out.println(i + " divisible by 3");
            } else {
                System.out.println(i + " something else");
            }
        }
    }
}