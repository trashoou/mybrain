package practice.student_sandbox_LinkedList;

import practice.city_bus.BusStopNode;

import java.util.LinkedList;

public class StudentSandbox2 {
    // разбор LinkedList
    public static void main(String[] args) {
        BusStopNode berlin = new BusStopNode("Berlin");
        BusStopNode munich = new BusStopNode("Munich");
        BusStopNode nuremberg = new BusStopNode("Nuremberg");
        BusStopNode stuttgart = new BusStopNode("Stuttgart");
        BusStopNode cologne = new BusStopNode("Cologne");

        // установили след остановку для Berlin setNext(***);
        berlin.setNext(nuremberg); // Berlin -> след остановка Nuremberg

        // установили след остановку для Nuremberg setNext(***);
        nuremberg.setNext(munich); // Nuremberg -> след остановка Munich

        // установили след остановку для Munich setNext(***)
        munich.setNext(stuttgart); // Munich -> след остановка Stuttgart

        // установили след остановку для Stuttgart setNext(***);
        stuttgart.setNext(cologne); // Stuttgart -> след остановка Cologne

        munich.setRange(100.45);

        BusStopNode node = berlin;
        while (node != null) {
            System.out.println(node.getStopName());
            node = node.getNext();
        }

        LinkedList t = new LinkedList<>();

//        BusStopNode node = berlin;
//        for (int i = 0; i < 4; i++) {
//            System.out.println(node.getStopName());
//            node = node.getNext();
//        }


        //munich.getNext();

        //munich.setNext(berlin);

    }

    // пример класса не обязательный к применению
    class Node {
        Object data; // данные
        Node next; // ссылка на следующую ноду
    }

    // [0][1][2][3][4]

    // LinkedList.size() -> кол-во нод в цепи
    // index:         0                 1                 2                     3
    // null <- [Ul Pushkina] <-> [Prospekt Mira] <-> [Ul Lenina]    <->   [Ul N-ya] -> null
    //                |                 |                 |                     |
    //              посуда          одежда              книги                техника
    //               head                                                     tail
    //        (начало или голова)                                       (хвост или конец)


    //
}
