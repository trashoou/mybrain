package practice.library.model;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    int yearOfPublishing;
    public static final int ISBN_LENGTH = 13; // никто не может поменять это значение
    private final long isbn;

    // полный конструктор
    public Book(String title, String author,int yearOfPublishing, long isbn) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = checkIsbn(isbn); // проверка ISBN
    }
    //конструктор без автора
    public Book(String title, int yearOfPublishing, long isbn) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = checkIsbn(isbn);
        author = "Автор неизвестен";
    }

    private long checkIsbn (long isbn) {
        if (countDigits(isbn) == ISBN_LENGTH) { // проверка, что 13 цифр у isbn
            return isbn;
        }
        return -1;
    }

    private int countDigits (long isbn) {
        int count = 0;
        while (isbn != 0) {
            count++; // счетчик кол-ва цифр
            isbn = isbn/10; // делим число на 10
        }
        return count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Title: " + title + '\n' +
                "Author: " + author + '\n' +
                "Year of publishing: " + yearOfPublishing + '\n' +
                "ISBN: " + isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && isbn == book.isbn && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

}
