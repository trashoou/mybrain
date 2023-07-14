import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        // Напишите программу, которая читает строку от пользователя,
        // определяет левый индекс и правый индекс (концы строки)
        // и выводит получившуюся в результате substring с левым и правым индексом.
        Scanner in = new Scanner(System.in); // включаем сканер
        System.out.println("Введите строку: "); // выводим сообщение пользователю
        String st = in.nextLine(); // создаем ввод для пользователя
        System.out.println("Ваша строка: "+st); // выводим сообщение пользователю
        int l = st.length(); // узнаём длину строки
        String firstSymbol = (st.substring(0,0+(+1))); // вырезаем левый индекс строки
        String lastSymbol = (st.substring(l-1,l)); // вырезаем правый индекс строки
        System.out.println("Выводим левый и правый индекс: "+firstSymbol+lastSymbol); // выводим результат
    }
}
