public class string_practice {
    public static void main(String[] args) {
        System.out.println("String practice");
        String st = "I like Java! Java is the best way to earn good salary in IT.";
        System.out.println(st); // печатаем строку
        //Распечатать последний символ строки. Используем метод String.charAt().
        int l = st.length(); // определяем длину строки
        System.out.println("Length of string is: " +l); // выводим длину строки на печать

        char lastSymbol = st.charAt(st.length() -1 ); // так мы узнали последний символ
        System.out.println("Last symbol is: " + lastSymbol);

        // Найти позицию подстроки "Java" в строке "I like Java!"
        String st1 = "I like Java!"; // задали строку
        int index = st1.indexOf("Java"); // узнаем с какого индекса начинается слово Java
        System.out.println("Java starts from index " + index); // выводим результат

        int index1 = st1.indexOf("like"); // узнаем с какого индекса начинается слово like
        System.out.println("like starts from index " + index1); // выводим результат

        // Проверить, содержит ли заданная строка подстроку “Java”. Используем метод String.contains().
        boolean yesOrNo = st.contains("Java");
        System.out.println(yesOrNo);   // выводим результат true/false

        // Заменить все символы "а" на "о".
        String ao = st.replace("a", "o"); // заменяем символы а на о
        System.out.println(ao); // выводим рузультат

        // Преобразуйте строку к верхнему и нижнему регистру.
        String stNew1 = st.toLowerCase(); // переводим строку в нижний регистр
        System.out.println(stNew1); // выводим результат

        String stNew2 = st.toUpperCase(); // переводим строку в верхний регистр
        System.out.println(stNew2); // выводим результат

        // Вырезать строку Java c помощью метода substring().
        String stNew3 = st.substring(7, 11); // вырезаем
        System.out.println(stNew3); // выводим

        // Проверить, заканчивается ли ваша строка подстрокой “!!!”
        String stNew4 = "I like Java!!!";
        yesOrNo = stNew4.endsWith(".");
        System.out.println(yesOrNo);

        yesOrNo = stNew4.startsWith("I like");
        System.out.println(yesOrNo);
    }
}
