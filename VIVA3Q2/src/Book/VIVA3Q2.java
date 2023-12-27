/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Book;

import java.util.Arrays;
import java.util.Scanner;

public class VIVA3Q2 {

    public static void main(String[] args) {
        boolean check = true;
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
        
        Scanner scanner = new Scanner(System.in);
        while (check) {
            System.out.println("_______________________________\n");
            System.out.println("1.Search book");
            System.out.println("2.Manage Book (add or remove)");
            System.out.println("Exit press (-1)");
            System.out.print("Choose (1,2,-1)");
            int choose = scanner.nextInt();
            if (choose == -1) {
                System.out.println("Thank you!");
                break;
            } else if (choose == 1) {

                while (check) {
                    System.out.println("_______________________________\n");
                    System.out.println("1.Searching for books by author: ");
                    System.out.println("2.Searching for books by title: ");
                    System.out.println("Back (-1)");
                    System.out.print("Choose (1,2,-1)");
                    choose = scanner.nextInt();
                    if (choose == -1) {
                        break;
                    } else if (choose == 1) {

                        System.out.println("Enter the book author");
                        scanner.nextLine();
                        String author = scanner.nextLine();
                        String isbn = library.findBooksByAuthor(author);
                        if (!(isbn == null)) {
                            while (check) {
                                System.out.println("You want to borrow?");
                                System.out.println("Press 1 to borrow\nPress 2 to exit");
                                choose = scanner.nextInt();
                                if (choose == 1) {
                                    boolean canBorrow = library.borrowBook(isbn);
                                    if (canBorrow) {
                                        System.out.println("\nYou've borrowed a book!");
                                    } else {
                                        System.out.println("\nSorry, this book is not available for borrowing.");
                                    }
                                    break;
                                } else if (choose == 2) {
                                    System.out.println("Thank you!");
                                    break;
                                } else {
                                    System.out.println("Please choose (1 or 2)");
                                }
                            }
                        }
                        while (check) {
                            System.out.println("Press 1 to continue");
                            choose = scanner.nextInt();
                            if (choose == 1) {
                                break;
                            }
                        }

                    } else if (choose == 2) {
                        System.out.println("Enter the book title");
                        scanner.nextLine();
                        String title = scanner.nextLine();
                        String isbn = library.findBooksByTitle(title);
                        if (!(isbn == null)) {
                            
                            while (check) {
                                System.out.println("You want to borrow?");
                                System.out.println("Press 1 to borrow\nPress 2 to exit");
                                choose = scanner.nextInt();
                                if (choose == 1) {
                                    boolean canBorrow = library.borrowBook(isbn);
                                    if (canBorrow) {
                                        System.out.println("\nYou've borrowed a book!");
                                    } else {
                                        System.out.println("\nSorry, this book is not available for borrowing.");
                                    }
                                    break;
                                } else if (choose == 2) {
                                    System.out.println("Thank you!");
                                    break;
                                } else {
                                    System.out.println("Please choose (1 or 2)");
                                }
                            }
                        }
                        while (check) {
                            System.out.println("Press 1 to continue");
                            choose = scanner.nextInt();
                            if (choose == 1) {
                                break;
                            }
                        }
                    } else {
                        System.out.println("Please choose (1 , 2 and -1)");
                    }
                }

            } else if (choose == 2) {
                while (check) {
                    System.out.println("_______________________________\n");
                    System.out.println("1.Sorted Books");
                    System.out.println("2.Add New Book");
                    System.out.println("3.Remove Book");
                    System.out.println("4.Updated Library:");
                    System.out.println("Back press (-1)");
                    System.out.print("Chooese (1,2,3,4,-1)");
                    choose = scanner.nextInt();
                    if (choose == -1) {
                        break;
                    } else if (choose == 1) {
                        while (check) {
                            System.out.println("Sorting by");
                            System.out.println("1.Title");
                            System.out.println("2.Author");
                            System.out.println("3.ISBN");
                            System.out.println("Back press (-1)");
                            System.out.print("Chooese (1,2,3,-1)");
                            choose = scanner.nextInt();

                            if (choose == -1) {
                                break;
                            } else if (choose == 1) {
                                System.out.println("Books in the library, sorted by title: ");
                                library.sortBooks(choose);
                                while (check) {
                                    System.out.println("Press 1 to continue");
                                    choose = scanner.nextInt();
                                    if (choose == 1) {
                                        break;
                                    }
                                }
                            } else if (choose == 2) {
                                System.out.println("Books in the library, sorted by author: ");
                                library.sortBooks(choose);
                                while (check) {
                                    System.out.println("Press 1 to continue");
                                    choose = scanner.nextInt();
                                    if (choose == 1) {
                                        break;
                                    }
                                }

                            } else if (choose == 3) {
                                System.out.println("Books in the library, sorted by ISBN: ");
                                library.sortBooks(choose);
                                while (check) {
                                    System.out.println("Press 1 to continue");
                                    choose = scanner.nextInt();
                                    if (choose == 1) {
                                        break;
                                    }
                                }

                            }
                        }

                    } else if (choose == 2) {
                        System.out.print("Enter book's title :");
                        scanner.nextLine();
                        String title = scanner.nextLine();
                        System.out.print("Enter book's author :");
                        String author = scanner.nextLine();
                        System.out.println("Enter book's ISBN");
                        String ISBN = scanner.nextLine();
                        Book book6 = new Book(title, author, ISBN);

                        library.addBook(book6);
                        System.out.println("Add successfully");
                        while (check) {
                            System.out.println("Press 1 to continue");
                            choose = scanner.nextInt();
                            if (choose == 1) {
                                break;
                            }
                        }
                    } else if (choose == 3) {
                        while (check) {
                            System.out.println("1.Searching for books by author: ");
                            System.out.println("2.Searching for books by title: ");
                            System.out.println("3.Searching for books by ISBN: ");
                            System.out.println("Back (-1)");
                            System.out.print("Choose (1,2,3,-1)");
                            choose = scanner.nextInt();
                            scanner.nextLine();
                            if (choose == -1) {
                                break;
                            } else if (choose == 1) {
                                System.out.println("Enter book's author");
                                String author = scanner.nextLine();
                                library.removeBook_author(author);
                                while (check) {
                                    System.out.println("Press 1 to continue");
                                    choose = scanner.nextInt();
                                    if (choose == 1) {
                                        break;
                                    }
                                }

                            } else if (choose == 2) {
                                System.out.println("Enter book's title");
                                String title = scanner.nextLine();
                                library.removeBook_title(title);
                                while (check) {
                                    System.out.println("Press 1 to continue");
                                    choose = scanner.nextInt();
                                    if (choose == 1) {
                                        break;
                                    }
                                }

                            } else if (choose == 3) {
                                System.out.println("Enter book's ISBN");
                                String isbn = scanner.nextLine();
                                library.removeBook(isbn);
                                while (check) {
                                    System.out.println("Press 1 to continue");
                                    choose = scanner.nextInt();
                                    if (choose == 1) {
                                        break;
                                    }
                                }

                            }
                        }

                    } else if (choose == 4) {
                        System.out.println("\nUpdated Library:");
                        library.displayLibrary();
                        while (check) {
                            System.out.println("Press 1 to continue");
                            choose = scanner.nextInt();
                            if (choose == 1) {
                                break;
                            }
                        }
                    }

                }

            } else {
                System.out.println("Please choose (1 , 2 and -1)");
            }

        }

    }
}
