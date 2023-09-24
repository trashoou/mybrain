package practice;

import java.util.List;

public class MyLinkedListImpl implements MyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedListImpl() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean add(String data) {
        Node newNode = new Node(data, tail, null);
        if (size == 0) {
            this.head = newNode;
            this.tail = newNode;

        }
        this.tail.next = newNode;
        this.tail = newNode;

        size++;
        return true;
    }

    @Override
    public boolean add(int index, String data) throws IndexOutOfBoundsException {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index: "+index+" is out of bound "+size);
        }
        Node temp = this.head;
        Node node2 = new Node(data, null, null);
        for (int i = 0; i <= index; i++) {
            if (i == index) {

                node2.prev = temp.prev;
                temp.prev = node2;
                Node b = node2.prev;
                b.next = node2;
                node2.next = temp;
                size++;
                return true;
            } else {
                temp = temp.next;
            }
        }
        return true;
    }

    @Override
    public boolean set(int index, String e) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: "+index+" is out of bound "+size);
        }

        Node eNode = new Node(e, null,null);

        if(index == 0){
            eNode.next = head.next;
            if (head.next != null) {
                head.next.prev = eNode;
            }
            head = eNode;
        } else {
            Node temp = get(index);
            eNode.prev = temp.prev;
            Node bNode = eNode.prev;
            bNode.next = eNode;
            eNode.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = eNode;
            }
        }

        return true;
    }

    @Override
    public boolean addFirst(String data) {
        Node newNode = new Node(data, null,null);
        head.prev = newNode;
        newNode.next = head;
        this.head = newNode;
        size++;
        return true;
    }

    @Override
    public boolean addLast(String data) {
        return add(data);
    }

    @Override
    public boolean addAll(List<String> list) {
        for (int i = 0; i < list.size()-1; i++) {
            add(list.get(i));
        }
        return true;
    }

    @Override
    public boolean contains(String data) {
        return false;
    }

    @Override
    public Node get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: "+index+" is out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public String getFirst() {
        return null;
    }

    @Override
    public String getLast() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(String data) {
        return 0;
    }

    @Override
    public int firstIndexOf(String data) {
        return 0;
    }

    @Override
    public int lastIndexOf(String data) {
        return 0;
    }

    @Override
    public MyLinkedListImpl reverseLinkedList() {
        MyLinkedListImpl reversedList = new MyLinkedListImpl();

        Node current = tail;

        while(current != null) {
            reversedList.add(current.data);

            current = current.prev;
        }

        return reversedList;
    }

    @Override
    public MyLinkedListImpl reverseLinkedList(int startIndex) {
        if (startIndex >= size) {
            throw new IndexOutOfBoundsException();
        }

        MyLinkedListImpl reversedPart = new MyLinkedListImpl();

        Node current = get(startIndex);

        while (current != null) {
            reversedPart.add(current.data);
            current = current.next;
        }

        MyLinkedListImpl reversedList = reverseLinkedList();

        return this;
    }

    @Override
    public MyLinkedListImpl reverseLinkedList(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > size || startIndex >= endIndex) {
            throw new IndexOutOfBoundsException();
        }
        Node startNode = get(startIndex);

        Node prev = null;
        Node current = startNode;

        for (int i = startIndex; i < endIndex; i++) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        if (startIndex == 0) {
            head = prev;
        } else {
            startNode.next = prev;
        }

        if (startIndex == 0) {
            get(endIndex - 1).next = current;
        } else {
            startNode.next = current;
        }
        return this;
    }


    public static class Node {
        String data;
        Node prev;
        Node next;

        public Node(String data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        Node current = head;
        int index = 0;

        while (current != null) {
            array[index] = current.data;
            current = current.next;
            index++;
        }

        return array;
    }

}
