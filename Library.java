
package viva3;

public class Library {
    
    private Book[] books;
    private int bookCount;
    
    public Library() {
        this.books = new Book[50];
        this.bookCount = 0;
    }
    
    public void addBook(Book book) {
        books[bookCount] = book;
        bookCount++;
    }
    
    public void findBooksByAuthor(String author) {
        System.out.println("Books by author '" + author + "':");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookAuthor().equalsIgnoreCase(author)) {
                displayBookDetails(books[i]);
            }
        }
    }
    
    public void findBooksByTitle(String title) {
        System.out.println("Books with title '" + title + "':");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookTitle().equalsIgnoreCase(title)) {
                displayBookDetails(books[i]);
            }
        }
    }
    
    public boolean borrowBook(String isbn) {
        int isbnNum = Integer.parseInt(isbn);
        int lastTwoDigits = isbnNum % 100;
        
        if (isPrime(lastTwoDigits)) {
            return false;
        }
        
        return true;
    }
    
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void sortBooks() {
        for (int i = 0; i < bookCount - 1; i++) {
            for (int j = 0; j < bookCount - i - 1; j++) {
                if (books[j].getBookTitle().compareToIgnoreCase(books[j + 1].getBookTitle()) > 0) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Books in the library, sorted by title:");
        for (int i = 0; i < bookCount; i++) {
            displayBookDetails(books[i]);
            System.out.println();
        }
    }
    
    public void removeBook(String isbn) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookISBN().equals(isbn)) {
                found = true;

                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null;
                bookCount--;
                break;
            }
        }
    }
    
    public void displayLibrary() {
        System.out.println("Books in the Library, sorted by title:");
        for (int i = 0; i < bookCount; i++) {
            displayBookDetails(books[i]);
            System.out.println();
        }
    }
    
    private void displayBookDetails(Book book) {
        System.out.println("- Title: " + book.getBookTitle());
        System.out.println("  Author: " + book.getBookAuthor());
        System.out.println("  ISBN: " + book.getBookISBN());
    }
}
