/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Book;


import java.util.Arrays;

class Book implements Comparable<Book> {
    private String bookTitle;
    private String author;
    private String ISBN;

    public Book(String bookTitle, String author, String ISBN) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public int compareTo(Book otherBook) {
        // Compare based on bookTitle for sorting
         return this.bookTitle.compareTo(otherBook.bookTitle);
        // You can modify the comparison based on your sorting criteria
        // For example, to sort by author: return this.author.compareTo(otherBook.author);
        // Ensure that the fields used in comparison are not null to avoid NullPointerException
        
    }
}

class Library {
    private Book[] books = new Book[5];
    private int bookCount = 0;

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        }
    }

   public void removeBook(String ISBN) {
    for (int i = 0; i < bookCount; i++) {
        if (books[i] != null && books[i].getISBN().equals(ISBN)) {
            // Shift remaining elements to fill the gap
            System.arraycopy(books, i + 1, books, i, bookCount - i - 1);
            bookCount--;
            return;
        }
    }
}


   public void findBooksByAuthor(String authorName) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthor().equals(authorName)) {
                printBookDetails(books[i]);
            }
        }
    }

    public void findBooksByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                printBookDetails(books[i]);
            }
        }
    }

    public boolean borrowBook(String ISBN) {
        int num = Integer.parseInt(ISBN);
        int temp = 0;
        for (int i = 0; i < 2; i++) {
            temp = num % 10;
            num /= 10;
        }
        boolean canBorrow = !isPrime(temp);

        if (canBorrow) {
            System.out.println("You've borrowed a book!");
        } else {
            System.out.println("Sorry, this book is not available for borrowing.");
        }

        return canBorrow;
    }

    public boolean isPrime(int num) {
        if (num < 2) {
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
        Arrays.sort(books, 0, bookCount);
        for (int i = 0; i < bookCount; i++) {
            printBookDetails(books[i]);
        }
    }

    public void displayLibrary() {
        for (int i = 0; i < bookCount; i++) {
            printBookDetails(books[i]);
        }
    }
     private void printBookDetails(Book book) {
        System.out.println("- Title: " + book.getTitle());
        System.out.println("  Author: " + book.getAuthor());
        System.out.println("  ISBN: " + book.getISBN());
        System.out.println();
    }


    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Standard Book of Spells", "Miranda Goshawk", "9452297");
        Book book2 = new Book("Advanced Potion-Making", "Libatius Borage", "4826972");
        Book book3 = new Book("Fantastic Beasts and Where to Find Them", "Newt Scamander", "1564815");
        Book book4 = new Book("The Dark Forces: A Guide to Self-Protection", "Quirinus Quirrell", "1891568");
        Book book5 = new Book("Forbidden Spells", "Salazar Slytherin", "7134567");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        System.out.println("Searching for books by author: ");
        library.findBooksByAuthor("Miranda Goshawk");

        System.out.println("\nSearching for books by title: ");
        library.findBooksByTitle("The Standard Book of Spells");

        boolean canBorrow = library.borrowBook("9452297");
        if (canBorrow) {
            System.out.println("\nYou've borrowed a book!");
        } else {
            System.out.println("\nSorry, this book is not available for borrowing.");
        }

        System.out.println("\nSorted Books:");
        library.sortBooks();

        library.removeBook("1564815");
        
        System.out.println("\nUpdated Library:");
        library.displayLibrary();
    }
}
