package LW_05_Q1;

import java.util.ArrayList;

public class Library {

    private ArrayList<BorrowableItems> borrowableItemsList;

    // Constructor
    public Library() {
        borrowableItemsList = new ArrayList<>();
    }

    // Add items to library
    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    // Checkout item by title
    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getTitle().equals(title) && book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book checked out: " + title);
                    return;
                }
            }
        }
        System.out.println("Book not available or not found.");
    }

    // List available items
    public void listAvailableItems() {
        System.out.println("Available Library Items:");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.displayInfo();
                }
            }
        }
    }

    // Display library info
    public void displayLibraryInfo() {
        int availableCount = 0;

        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    availableCount++;
                }
            }
        }

        System.out.println("Total items: " + borrowableItemsList.size());
        System.out.println("Available items: " + availableCount);
    }
}
