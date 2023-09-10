package practice.student_sandbox;

import java.util.ArrayList;

public class StudentSandbox {
    public static void main(String[] args) {
        // <> - обозначает generic тип данных, если не указать,
        // "ArrayList list" = сможет принимать любые
        // если указать конкретный тип, то только объекты этого типа, например:
        // "ArrayList<String> list" - будет хранить исключительно String
        ArrayList<String> list1 = new ArrayList(12);
        ArrayList<String> list2 = new ArrayList(12);

        list1.add("list1-1");
        list1.add("list1-2");
        list1.add("list1-3");

        list2.add("list2-1");
        list2.add("list2-2");
        list2.add("list2-3");


        ArrayList<ArrayList<String>> listArrayList = new ArrayList<>();

        listArrayList.add(list1);
        listArrayList.add(list2);

        // listArrayList(list1, list2
        listArrayList.get(0).add("hello");


        // внешний цикл - перебирает все элементы, которые находятся внутри listArrayList, то есть, перебивает все
        // вложенные в него ArrayList. В нашем примере это list1 и list2
        // (чтобы их получить используем listArrayList.get(i))
        for (int i = 0; i < listArrayList.size(); i++) {
            System.out.println();
            // при помощи второго вложенного цикла получаем доступ к элементам конкретного ВЛОЖЕНГОГО листа,
            // то есть получаем содержимое list1 и list2
            // чтобы их получить listArraylist.get(i).get(j), где
            // get(i) - вытащит конкретным массив из нашего массива массивов,
            // а get(i).get(j) - вытащит конкретную строку из массива, который мы вытащили
            for (int j = 0; j < listArrayList.get(i).size(); j++) {

                System.out.print(listArrayList.get(i).get(j) + " | ");
            }
        }

        // [{1, 2, 3}, {4, 5, 6}]
        // создали двумерный массив целых чисел (int), то есть массив, который содержит массивы чисел
        int[][] twoDimArrayFullEmptyInit = new int[2][3]; // [{0, 0, 0}, {0, 0, 0}]

        int[][] twoDimArrayWithoutInit = new int[2][]; // [null, null]

        int[][] twoDimArrayFullInit = {{1, 2, 3}, {4, 5, 6, 7, 8}}; // проинициализировали двмерный массив значениями

        twoDimArrayFullEmptyInit[0][0] = 5; // [{5, 0, 0}, {0, 0, 0}]
        twoDimArrayFullEmptyInit[1][1] = 7; // [{5, 0, 0}, {0, 7, 0}]
        twoDimArrayFullEmptyInit[1]= new int[]{15, 16, 17}; // [{5, 0, 0}, {15, 16, 17}]

        twoDimArrayWithoutInit[1] = new int[]{-17, 0, 17}; // [null, {-17, 0, 17} ]
        twoDimArrayWithoutInit[1][1] = 23; // [null, {-17, 23, 17} ]

        twoDimArrayFullInit[1] = new int[]{8, 10, 12}; // {{1, 2, 3}, {8, 10, 12}};
        System.out.println();
        System.out.println(twoDimArrayFullInit.length);
        System.out.println(twoDimArrayFullInit[1].length);

        String str = "hello"; // ячейка1

        str = "HELLO"; // ячейка2, теперь значения в ячейка1 никому не нужны (на них никто не ссылается)

        System.gc(); // gc - сокращено от garbage collector, вызывает сборщик мусора, который очищает содержимое всех
        // ячеек на которые никто не ссылается, в нашем примере содержимое ячейка1











    }
}
