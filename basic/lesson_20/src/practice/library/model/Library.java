package practice.library.model;

public class Library {
    private Book[] books; // массив типа Book, куда попадут все книги в библиотеке
    private int size; // кол-во книг в библиотеке

    // метод класса, который задает размер библиотеки, т.е. длину массива Book
    public Library (int capacity) {
        books = new Book[capacity];
    }

    //метод добавления книги
    public boolean addBook(Book book) {
        if ((size == books.length) || findBook(book.getIsbn()) != null) {
        return false; // не можем добавить кнгиу, так как нету места, или такая книга уже есть
        }
        books[size] = book; // помещаем книгу в массив
        size++;
        return true;
    }

    //метод поиска кинги по ISBN

    public Book findBook (long isbn) {
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if (isbn == books[i].getIsbn()) { // проверяем совпадение ISBN
                return books[i]; // возвращаем элемент массива типа Book
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }
}
