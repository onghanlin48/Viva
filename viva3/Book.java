package viva3;


public class Book {
    private String bookTitle;
    private String author;
    private String isbn;
    
    public Book (){
        bookTitle =null;
        author = null;
        isbn = null;
        
    }
    public Book (String t, String a ,String i){
        this.bookTitle = t;
        this.author=a;
        this.isbn=i;
    }
    
    public String getBookTitle (){
        return bookTitle;
    }
    public void setBookTitle(String s){
        bookTitle =s;
    }
     public String getAuthor (){
        return author;
    }
    public void setAuthor(String a){
        author = a;
    }
      public String getISBN (){
        return isbn;
    }
    public void setISBN(String i){
        isbn = i;
    }
    
}
