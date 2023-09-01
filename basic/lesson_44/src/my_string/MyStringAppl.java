package my_string;

import java.util.Iterator;

public class MyStringAppl {

    public static void main(String[] args) {

        MyString myString = new MyString("Two beer, or not two beer"); // Создали объект нового класса MyString
        System.out.println(myString);

        Iterator<Character> iterator = myString.iterator();

        while(iterator.hasNext()){
            char ch = iterator.next();
            System.out.print(Character.toUpperCase(ch));
        }
        System.out.println();
        System.out.println(myString);







//        myString.addChar('!');
//        System.out.println(myString);
//        myString.removeChar('r');
//        System.out.println(myString);
//        // напечатать все большими
//
//        StringBuilder builder = myString.getStr(); // в переменную builder переложили содержание myString с помощью get
//        System.out.println(builder);
//        for (int i = 0; i < builder.length(); i++) {
//            char c = builder.charAt(i);
//            c = Character.toUpperCase(c);
//            System.out.print(c);
//        }
//        System.out.println();
//        // другой программист делает
//        builder.setLength(5);
//        System.out.println(builder);
//        System.out.println(myString);

    }

}
