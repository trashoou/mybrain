package homework.book.controller;
import homework.book.model.Dictionary;
import homework.book.model.Book;
public class BookAppl {
    public static void main(String[] args) {
        Book bk1 = new Book(12344567,"Title 1","Author 1", 2020);
        Book bk2 = new Book(90832,"Title 2",2010);

        bk1.display();
        System.out.println();
        bk2.display();
        System.out.println();

        Dictionary dc1 = new Dictionary(22222222,"NoName",2002,"GermanyRussia",500);
        dc1.display();
        System.out.println();
        Dictionary dc2 = new Dictionary(22222223,"NoName",2002,"PolishGermany",1000);
        dc2.display();
    }
}
