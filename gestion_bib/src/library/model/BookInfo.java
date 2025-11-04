package library.model;

public class BookInfo {
    private String title;
    private String author;

    public BookInfo(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    // ✅ Responsabilité unique : informations du livre
    public String getDisplayInfo() {
        return title + " by " + author;
    }

    public boolean isValid() {
        return title != null && !title.isEmpty() &&
                author != null && !author.isEmpty();
    }
}