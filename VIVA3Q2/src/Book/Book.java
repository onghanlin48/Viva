/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

/**
 *
 * @author Huawei
 */
public class Book implements Comparable<Book> {
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