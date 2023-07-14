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

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setYear(int year) {this.year = year;}


    public void display () {
        if (year >= 1450 && year <= 2023){
            System.out.println("Title "+title);
            System.out.println("Author "+author);
            System.out.println("Year "+year);
            System.out.println("ISBN "+isbn);
            System.out.println();
        } else {
            System.out.println("Title "+title);
            System.out.println("Author "+author);
            System.out.println("Invalid year of publishing");
            System.out.println("ISBN "+isbn);
            System.out.println();
        }

    }
}
