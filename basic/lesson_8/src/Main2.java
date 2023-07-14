import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Parsing IP-address");
//      Программа получает на вход IP-адрес в одну строку:
//      например, 192.168.23.1 (четыре числа, разделённые точками).
//      Каждое число должно быть в диапазоне от 0 до 255.
//      Программа должна вывести эти четыре числа по отдельности.

        Scanner in = new Scanner(System.in);
        System.out.println("Input IP-address:");
        String ipAddress = in.nextLine();


        ipAddress = ipAddress.trim(); // отсекли случайные пробелы в начале и конце

        int firstDotIndex = ipAddress.indexOf('.'); // нашли номер позиции 1-й точки
        int secondDotIndex = ipAddress.indexOf('.', firstDotIndex + 1 ); // ищем номер позиции 2-й точки
        int thirdDotIndex = ipAddress.indexOf('.', secondDotIndex + 1 ); // ищем номер позиции 3-й точки
        int extraDotIndex = ipAddress.indexOf('.', thirdDotIndex + 1 ); // ищем еще одну точку
        // если этой точки нет, то вернется значение -1

        if (extraDotIndex != -1) {
            System.out.println("Wrong input, a lot of dots");
        }

        if (extraDotIndex == -1) {
            int l = ipAddress.length();
            String byte1 = ipAddress.substring(0, firstDotIndex);
            int num1 = Integer.parseInt(byte1);
            String byte2 = ipAddress.substring(firstDotIndex + 1 , secondDotIndex);
            int num2 = Integer.parseInt(byte2);
            String byte3 = ipAddress.substring(secondDotIndex + 1,thirdDotIndex);
            int num3 = Integer.parseInt(byte3);
            String byte4 = ipAddress.substring(thirdDotIndex + 1, l);
            int num4 = Integer.parseInt(byte4);
            System.out.println(byte1);
            System.out.println(byte2);
            System.out.println(byte3);
            System.out.println(byte4);
        }
    }
}
