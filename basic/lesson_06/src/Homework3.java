public class Homework3 {
    public static void main(String[] args) {


        String st = "wait"; // задаем строку с четным количеством символов
        int l = st.length(); // определяем длину строки
        System.out.println("Length of string is: " +l); // сообщнеию пользователю
        int middle = l/2; // делим длину строки на половину, чтобы узнать середину
        String st1 = st.substring(middle-1, middle+1); //вырезаем левый индекс в середине
        System.out.println(st1); //вырезаем правый индекс в середине


    }

}
