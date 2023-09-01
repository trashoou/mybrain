package pratice.array_list;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements IList<E>{

    // поля
    private Object[] elements; // массив для элементов списка
    private int size; // размер массива

    // конструктор
    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal capacity = " + initialCapacity);
        }
        elements = new Object[initialCapacity];
    }

    public MyArrayList(){
        this(5);
    }

    // O(1)
    @Override
    public int size() {
        return size;
    }

    // O(n)
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean add(E element) {
        ensureCapacity();
        elements[size++] = element;
        //size++;
        return true;
    }


    @Override
    public boolean add(int index, E element) {
        if (index == size) { // добавление в конец списка
            add(element);
            return true;
        }
        checkIndex(index);
        ensureCapacity();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
        return true;
    }


    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index]; // (E) - приведение элемента к типу
    }

    @Override
    public int indexOf(Object o) {
        if(o != null) {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        } else { // когда элемент листа (объект) null
            for (int i = 0; i < size; i++) {
                if (o == elements[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o != null) {
            for (int i = size-1; i > 0; i--) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        } else {
            for (int i = size-1; i > 0; i--) {
                if (o == elements[i]){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E removedElement = (E) elements[index];
        System.arraycopy(elements,index+1,elements,index,size - index - 1);
        elements = Arrays.copyOf(elements,elements.length-1);
        size--;
        return removedElement;
    }


    @Override
    public E set(int index, E element) {
        checkIndex(index);

        E oldElement = (E) elements[index]; // Сохраняем старый элемент

        elements[index] = element; // Присваиваем новый элемент на указанный индекс

        return oldElement; // Возвращаем старый элемент
    }


    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private void ensureCapacity(){
        if (size == elements.length){
            if (size == Integer.MAX_VALUE) {
                throw new OutOfMemoryError();
            }
            // проверка на выход за Integer.MAX_VALUE
            int newCapacity = elements.length + elements.length / 2; // вычисляем новую длину массива
            if (newCapacity < 0) {
                newCapacity = Integer.MAX_VALUE;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    private void checkIndex (int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
