public class method_example {
    public static void main(String[] args) {
        System.out.println("Perimeter of Rectangle with method");

        int a = 100; // 1-я сторона прямоугольника
        int b = 300; // 2-я сторона прямоугольника

        int per = perimeter(a, b); // вызов метода

        System.out.println("Perimeter = " + per);



    } // end of the method Main
    //___________Methods_________
    public static int perimeter (int x, int y) { // метод получает на вход два целых числа
        // int p = (x + y) * 2;
        // return p;
        return (x + y) * 2; // возвращает результат
    }


    //_________end of Methods_________
} // end of the class Main
