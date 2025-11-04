package library.service;

import java.util.ArrayList;
import java.util.List;
import library.model.Lendable;
import library.model.Book;
import library.model.DigitalBook;

public class Library {
    private List<Lendable> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Lendable item) {
        items.add(item);
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    public List<Lendable> getAvailableItems() {
        List<Lendable> available = new ArrayList<>();
        for (Lendable item : items) {
            if (!item.isBorrowed()) {
                available.add(item);
            }
        }
        return available;
    }

    public List<Lendable> getAllItems() {
        return new ArrayList<>(items);
    }

    // CORRECTION : Cette méthode doit AFFICHER les items
    public void listAllItems() {
        for (Lendable item : items) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            } else if (item instanceof DigitalBook) {
                DigitalBook digital = (DigitalBook) item;
                System.out.println(digital.getTitle() + " [Digital] - " + digital.getFileSizeMB() + "MB");
            } else {
                System.out.println("Unknown item type");
            }
        }
    }
}