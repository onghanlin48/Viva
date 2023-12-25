
package viva3;

import java.util.Random;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private String bookISBN;
    
    public Book() {
        this.bookTitle = null;
        this.bookAuthor = null;
        this.bookISBN = null;
    }
    
    public Book(String bookTitle, String bookAuthor, String bookISBN) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
    }
    
    public String getBookTitle() {
        return bookTitle;
    }
    
    public String getBookAuthor() {
        return bookAuthor;
    }
    
    public String getBookISBN() {
        return bookISBN;
    }
    
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    
    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }
}
