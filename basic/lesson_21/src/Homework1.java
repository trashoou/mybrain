public class Homework1 {
    public static void main(String[] args) {
        String st = " Меня зовут Дмитрий Храмов ";
        String st1 = "ДИМА";
        String st2 = "дима";

        String[] words = st.split(" ");
        int n = words.length;

        System.out.println("String st: "+st);
        System.out.println("String st1: "+st1);
        System.out.println("String st2: "+st2);
        System.out.println("Кол-во слов в String st: "+n);
        System.out.println();
        System.out.println("Длина строки: "+st.length());
        System.out.println("Возвращаем символ в середине String: "+st.charAt(st.length()/2));
        System.out.println("Сравнивание String игнорируя регистр (ДИМА/дима): "+st1.equalsIgnoreCase(st2));
        System.out.println("Возвращаем String "+st1+ " в нижнем регистре: "+st1.toLowerCase());
        System.out.println("Возвращаем String "+st2+" в верхнем регистре: "+st1.toUpperCase());
        System.out.println("Находим позицию строки 'Дмитрий' "+st.indexOf("Дмитрий"));
        System.out.println("Вырезаем строку 'Дмитрий Храмов': "+st.substring(st.length()/2-1));
        System.out.println("Заменяем в String "+st+" 'Дмитрий' на 'Храмов': "+st.replace(words[2],words[3]));
        System.out.println("Убираем пробелы в начале и конце String "+st+": "+st.trim());
        String[] str = st.split(" ");

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" | ");
        }
    }
}