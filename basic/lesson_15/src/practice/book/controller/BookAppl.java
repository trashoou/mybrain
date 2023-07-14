package practice.book.controller;

import practice.book.model.Book;
public class BookAppl {
    public static void main(String[] args) {

        Book book1 = new Book("Heart of dragon","Kirill Klevanski",2016,100000000L);
        Book book2 = new Book("Code Da Vinci","Den Brauen",2003,100000001L);
        Book book3 = new Book("Jack London","White Tusk",1900,100000201L);

        book1.display();
        book2.display();
        book3.display();

    }
}
