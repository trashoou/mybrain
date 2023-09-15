package main.code.practice;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {

        //тк Set - интерфейс, для создания объекта мы используем конкретную реализацию, например HashSet
        // три основные реализации Set - представлены ниже. вы можете раскомментироавть любую, закомментировав две
        // другие, и посмотреть, что измениться
        Set<String> set = new HashSet<>();
//        Set<String> set = new TreeSet<>();
//        Set<String> set = new LinkedHashSet<>();


        //добавление
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("one");
        set.add("two");
        set.add("three");
        //TreeSet не позволяет добавлять null, поэтому эту строку следует закомментировать, при выборе TreeSet
        set.add(null);
        // печать при помощи кастомного метода
        print(set);

        //.contains() - возвращает true или false в зависимости от того, содержится ли данный элемент в коллекции или нет
        System.out.println(set.contains("one"));

        // ужаляет данный эелемент из коллекции.
        set.remove("one");

        // возвращает количество элементов в коллекции
        System.out.println(set.size());

        // .isEmpty() - возвращает true или false в зависимости от того, содержит ли даннаая колекция хоть что-то
        System.out.println(set.isEmpty());

        // удаляет все элементы в коллекции
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        // в качестве альтернативы приведен ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("one");
        list.add("two");
        list.add("three");
        print(list);


        // при инициализации Set некими изначальными значениями мы получаем НЕИЗМЕНЯЕМЫЙ сет, то есть сет
        // в который нельзя добавлять или удалять из него элементы
        Set<String> immutable = Set.of("one", "two", "three");
        //immutable.add("four");
        //immutable.remove("one");


    }

    //метод распечатает любой класс, который имплементирует интерфейс Iterable, то есть это может быть любая коллекция
    private static void print(Iterable iterable) {
        System.out.println(iterable.getClass());
        iterable.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    //классная работа:
    // Задача1. Объединение множеств: Напишите метод, который принимает два множества и возвращает новое множество,
    // содержащее их объединение.
    public static Set<String> unionSet(Set<String> first, Set<String> second) {
        Set<String> set = new HashSet<>(first);
        for (String s : set) {
            System.out.println();
        }
        //ваш код тут
        return null;
    }

    // Задача 2. Разность множеств: Создайте метод, который принимает два множества и возвращает новое множество,
    // содержащее только уникальные элементы из двух сетов (не совпадающие)
    public static Set<String> uniqueElement(Set<String> first, Set<String> second) {
        //ваш код тут
        return null;
    }






}
