/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Huawei
 */
public class Library {

    private Book[] books = new Book[5];
    private int bookCount = 0;

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        }
    }

    public void removeBook(String ISBN) {
        boolean check = true;
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].getISBN().equals(ISBN)) {
                // Shift remaining elements to fill the gap
                System.arraycopy(books, i + 1, books, i, bookCount - i - 1);
                bookCount--;
                System.out.println(books[i].getTitle() + " Remove");
                check = false;
            }
        }
        if (check) {
            System.out.println("No record");
        }
    }

    public void removeBook_title(String title) {
        boolean check = true;
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                // Shift remaining elements to fill the gap
                System.arraycopy(books, i + 1, books, i, bookCount - i - 1);
                bookCount--;
                System.out.println(books[i].getTitle() + " Remove");
                check = false;
            }
        }
        if (check) {
            System.out.println("No record");
        }
    }

    public void removeBook_author(String author) {
        boolean check = true;
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].getAuthor().equals(author)) {
                // Shift remaining elements to fill the gap
                System.arraycopy(books, i + 1, books, i, bookCount - i - 1);
                bookCount--;
                System.out.println(books[i].getTitle() + " Remove");
                check = false;
            }
        }
        if (check) {
            System.out.println("No record");
        }
    }

    public String findBooksByAuthor(String authorName) {
        boolean check = true;
        String id = null;
        ArrayList<Integer> a = new ArrayList<>();
        int x = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthor().equals(authorName)) {
                a.add(i);
                x += 1;
                System.out.println("No " + x);
                printBookDetails(books[i]);
                check = false;
            }
        }
        if (check) {
            System.out.println("No record");
            return id;
        } else {
            while (true) {
                System.out.println("Which book you choose?");
                Scanner scanner = new Scanner(System.in);
                int choose = scanner.nextInt();
                if (choose >= 1 && choose <= x) {
                    printBookDetails(books[a.get(choose - 1)]);
                    id = books[a.get(choose - 1)].getISBN();
                    break;   
                }
            }
            
        }
        return id;
    }

    public String findBooksByTitle(String title) {
       boolean check = true;
        String id = null;
        ArrayList<Integer> a = new ArrayList<>();
        int x = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                a.add(i);
                x += 1;
                System.out.println("No " + x);
                printBookDetails(books[i]);
                check = false;
            }
        }
        if (check) {
            System.out.println("No record");
            return id;
        } else {
            while (true) {
                System.out.println("Which book you choose?");
                Scanner scanner = new Scanner(System.in);
                int choose = scanner.nextInt();
                if (choose >= 1 && choose <= x) {
                    printBookDetails(books[a.get(choose - 1)]);
                    id = books[a.get(choose - 1)].getISBN();
                    break;   
                }
            }
            
        }
        return id;
    }

    public boolean borrowBook(String ISBN) {
        int num = Integer.parseInt(ISBN);
      
        int lastTwoDigits = num % 100;
        boolean canBorrow = !isPrime(lastTwoDigits);

        return canBorrow;
    }

    public boolean isPrime(int num) {
        System.out.println(num);
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

    public void sortBooks(int x) {
        switch (x) {
            case 1:
                Arrays.sort(books, 0, bookCount, Comparator.comparing(Book::getTitle));
                break;
            case 2:
                Arrays.sort(books, 0, bookCount, Comparator.comparing(Book::getAuthor));
                break;
            case 3:
                Arrays.sort(books, 0, bookCount, Comparator.comparing(Book::getISBN));
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        for (int i = 0; i < bookCount; i++) {
            printBookDetails(books[i]);
        }
    }

    public void displayLibrary() {
        for (int i = 0; i < bookCount; i++) {
            printBookDetails(books[i]);
        }
    }

    public void printBookDetails(Book book) {
        System.out.println("- Title: " + book.getTitle());
        System.out.println("  Author: " + book.getAuthor());
        System.out.println("  ISBN: " + book.getISBN());
        System.out.println();
    }
}
    
