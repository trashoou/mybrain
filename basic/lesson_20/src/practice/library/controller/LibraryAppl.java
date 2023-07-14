package practice.library.controller;
import practice.library.model.Book;
import practice.library.model.Library;

public class LibraryAppl {
    public static void main(String[] args) {
        Library library = new Library(1000);
        library.addBook(new Book("War and Peace","Lev Tolstoy",1998,2000000000000L));
        library.addBook(new Book("Anna Karenina","Lev Tolstoy",1995,2000000000001L));
        library.addBook(new Book("1984","Oruell",1985,2000000000002L));
        library.addBook(new Book("1984","Oruell",1985,2000000000003L));

        System.out.println(library.getSize());
        System.out.println(library.findBook(2000000000000L));
    }
}
