package homework.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private Book[] books; // массив типа Book, куда попадут все книги в библиотеке
    private int size; // кол-во книг в библиотеке

    // метод класса, который задает размер библиотеки, т.е. длину массива Book
    public Library (int capacity) {
        books = new Book[capacity];
    }

    //метод добавления книги
    public boolean addBook(Book book) {
        if ((size == books.length) || findBookISBN(book.getIsbn()) != null) {
        return false; // не можем добавить кнгиу, так как нету места, или такая книга уже есть
        }
        books[size] = book; // помещаем книгу в массив
        size++;
        return true;
    }

    //метод поиска кинги по ISBN

    public Book findBookISBN (long isbn) {
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if (isbn == books[i].getIsbn()) { // проверяем совпадение ISBN
                return books[i]; // возвращаем элемент массива типа Book
            }
        }
        return null;
    }
    // метод поиска книг по автору
    public Book[] findBookAuthor (String author, Book[] books) {
        int count = 0;
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if (author.equals(books[i].getAuthor())) { // проверяем совпадение Author
                count++;
            }
        }
        Book[] booksf = new Book[count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < size; j++) {
                if (author.equals(books[i].getAuthor())) { // проверяем совпадение Author
                    booksf[i] = books[j];
                    i++;
                }
            }
        } return booksf;
    }
    // метод поиска книг по тайтлу
    public Book findBookTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book removeBook (long isbn, Book[] books) {
        Book victim = null;
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                victim = books[i];
                books[i] = books[size-1];
                books[size-1] = null;
                size--;
                break;
            }
        }
        return victim;
    }

    public int getSize() {
        return size;
    }

}
