package viva3;

public class Viva3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Phantom p1 = new Phantom(1, 1);

        Phantom.BlackMage blackMage = new Phantom.BlackMage();

        System.out.println(p1.toString());
        System.out.println(p1.damage(blackMage) + "\nThe Black Mage is defeated.");

        System.out.println("\n");

        Library library = new Library();
        library.addBook(new Book("The Standard Book of Spells", "Miranda Goshawk", "9452297"));
        library.addBook(new Book("Advanced Potion-Making", "Libatius Borage", "4826972"));
        library.addBook(new Book("Fantastic Beasts and Where to Find Them", "Newt Scamander", "1564815"));
        library.addBook(new Book("The Dark Forces: A Guide to Self-Protection", "Quirinus Quirrell", "1891568"));
        library.addBook(new Book("Forbidden Spells", "Salazar Slytherin", "7134567"));
        // Display all books in the library
        System.out.println("Books in the library:");
        library.displayBooks();

        // Search for books by title
        System.out.println("\nSearching for books by title:");
        Book[] searchResults = library.searchByTitle("The Standard Book of Spells");
        for (Book result : searchResults) {
            System.out.println("Title: " + result.getBookTitle() + ", Author: " + result.getAuthor() + ", ISBN: " + result.getISBN());
        }

        // Search for books by author
        System.out.println("\nSearching for books by author:");
        searchResults = library.searchByAuthor("Miranda Goshawk");
        for (Book result : searchResults) {
            System.out.println("- Title: " + result.getBookTitle() + "\n  Author: " + result.getAuthor() + "\n  ISBN: " + result.getISBN());
        }

        // Check whether can borrow
        System.out.println("\nChecking whether can borrow");
        boolean canBorrow = library.borrowBook("9452297");
        if (canBorrow) {
            System.out.println("\nYou've borrowed a book!");
        } else {
            System.out.println("\nSorry, this book is not available for borrowing");

// Sort books by title and display
            library.sortBook();
            System.out.println("\nBooks after sorting by title:");
            library.displayBooks();

            // Remove a book from the library
            System.out.println("\nRemove a book from the library:");
            library.removeBook("3456789127");
            library.displayBooks();

        }

    }
}
