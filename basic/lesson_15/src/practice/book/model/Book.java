package practice.book.model;

public class Book {
    public String title;// название - title
    public String author;// автор - author
    public int year;// год - year
    public long isbn;// ISBN - это уникальный номер книги

    // методы класса Book
    // конструктор

    public Book(String title, String author, int year, long isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public void display () {
        System.out.println("Title "+title);
        System.out.println("Author "+author);
        System.out.println("Year "+year);
        System.out.println("ISBN "+isbn);
        System.out.println();
    }
}
