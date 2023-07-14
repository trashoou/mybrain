public class Homework {
    public static void main(String[] args) {

        String st = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println(st); // задали строку
        //Распечатать последний символ строки. Используем метод String.charAt().
        int l = st.length(); // определяем длину строки
        System.out.println("Length of string is: " +l); // выводим длину строки на печать

        char lastSymbol = st.charAt(st.length() -1 ); // так мы узнали последний символ
        System.out.println("Last symbol is: " + lastSymbol); // выводим последний символ строки

        // Найти позицию подстроки "Java" в строке.
        int index = st.indexOf("Java"); // узнаем с какого индекса начинается слово Java
        System.out.println("Java starts from index: " + index); // выводим результат

        // Проверить, содержит ли заданная строка подстроку “Java”. Используем метод String.contains().
        boolean yesOrNo = st.contains("Java");
        System.out.println("does the string contain the substring Java ? - " + yesOrNo);   // выводим результат true/false

        // Заменить все символы "o" на "a".
        String ao = st.replace("o", "a"); // заменяем символы o на a
        System.out.println(ao); // выводим результат

        // Преобразуйте строку к верхнему и нижнему регистру.
        String stNew1 = st.toLowerCase(); // переводим строку в нижний регистр
        System.out.println(stNew1); // выводим результат

        String stNew2 = st.toUpperCase(); // переводим строку в верхний регистр
        System.out.println(stNew2); // выводим результат

        // Вырезать строку Java c помощью метода substring().
        String stNew3 = st.substring(19, 23); // вырезаем
        System.out.println("Cut out a substring: " + stNew3); // выводим

        // Проверить, заканчивается ли ваша строка подстрокой “!!!”
        yesOrNo = st.endsWith("!!!");
        System.out.println("does your string end with the substring “!!!” ? - " + yesOrNo); //

        yesOrNo = st.startsWith("I'm proud");
        System.out.println("does your string start with the substring “I'm proud” ? - " + yesOrNo);
    }
}
