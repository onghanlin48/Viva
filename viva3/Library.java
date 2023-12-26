/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

import java.util.Arrays;

/**
 *
 * @author jwenn
 */
public class Library {

    private static int maxBook = 999999;
    private Book[] books;
    private int numOfBooks;

    public Library() {
        this.books = new Book[maxBook];
        this.numOfBooks = 0;
    }

    public Book[] searchByTitle(String searchName) {
        Book[] sameTitle = new Book[maxBook];
        int count = 0;

        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getBookTitle().equalsIgnoreCase(searchName)) {
                sameTitle[count] = books[i];
                count++;
            }
        }
        return Arrays.copyOf(sameTitle,count);
    }

    public Book[] searchByAuthor(String searchAuthor) {
        Book[] sameAuthor = new Book[maxBook];
        int count = 0;

        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(searchAuthor)) {
                sameAuthor[count] = books[i];
                count++;
            }
        }
        return Arrays.copyOf(sameAuthor,count);
    }

    public void addBook(Book book) {
        if (numOfBooks < maxBook) {
            books[numOfBooks++] = book;
        } else {
            System.out.println("Library is full.");
        }
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getISBN().equals(isbn)) {
                for (int j = i; j < numOfBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                numOfBooks--;
                break;
            }
        }

    }
    
    public boolean borrowBook(String isbn){
        int digit =0;
        for(int i=isbn.length()-1;i<=isbn.length()-2;i--){
            digit *=10;
            digit += Integer.parseInt(String.valueOf(isbn.charAt(i)));
        }
        if(isPrime(digit)){
            return false;
        }
        return true;
        
    }
    
    public boolean isPrime(int digit){
        if(digit == 1){
            return false;
        }
        for(int i=2;i<digit;i++){
            if(digit%i==0){
                return false;
            }
        }return true;
    }
    
    public void sortBook(){
        for(int pass =0;pass < numOfBooks;pass++){
            for(int i=0;i<numOfBooks-1;i++){
                if(books[i].getBookTitle().compareTo(books[i+1].getBookTitle())>0){
                    String temp = books[i].getBookTitle();
                    books[i].setBookTitle(books[i+1].getBookTitle());;
                    books[i+1].setBookTitle(temp);
                    
                }
            }
        }
    }
    
    public void displayBooks(){
        for (int i=0;i<numOfBooks;i++){
            System.out.println("- Title: "+ books[i].getBookTitle()+
                    "\n  Author: "+books[i].getAuthor()+
                    "\n  ISBN: "+books[i].getISBN());
        }
    }
}
