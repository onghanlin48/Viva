
package viva3;


public class Viva3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Phantom p1 = new Phantom (1,1);
        
        Phantom.BlackMage blackMage = new Phantom.BlackMage();
        
        System.out.println(p1.toString());
        System.out.println(p1.damage(blackMage)+"\nThe Black Mage is defeated.");
    
        System.out.println("\n");
        
        
    Library library = new Library();
    library.addBook(new Book("The Sorcerer's Stone", "J.K. Rowling", "1234567891"));
        library.addBook(new Book("The Chamber of Secrets", "J.K. Rowling", "2345678913"));
        library.addBook(new Book("The Prisoner of Azkaban", "J.K. Rowling", "3456789127"));
        library.addBook(new Book("The Goblet of Fire", "J.K. Rowling", "4567891231"));
        library.addBook(new Book("The Order of the Phoenix", "J.K. Rowling", "5678912347"));
        library.addBook(new Book("The Half-Blood Prince", "J.K. Rowling", "6789123453"));
        library.addBook(new Book("The Deathly Hallows", "J.K. Rowling", "7891234567"));

        // Display all books in the library
        System.out.println("Books in the library:");
        library.displayBooks();

        // Search for books by title
        System.out.println("\nSearch for books by title:");
       Book [] searchResults = library.searchByTitle("The Sorcerer's Stone");
        for (Book result : searchResults) {
            System.out.println("Title: " + result.getBookTitle() + ", Author: " + result.getAuthor() + ", ISBN: " + result.getISBN());
        }

        // Search for books by author
        System.out.println("\nSearch for books by author:");
        searchResults = library.searchByAuthor("J.K. Rowling");
        for (Book result : searchResults) {
            System.out.println("Title: " + result.getBookTitle() + ", Author: " + result.getAuthor() + ", ISBN: " + result.getISBN());
        }

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
