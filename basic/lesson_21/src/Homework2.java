public class Homework2 {
    public static void main(String[] args) {
        String st = "Казнить нельзя помиловать";
        String words[] = st.split(" ");

        String temp = words[0];
        words[0] = words[words.length-1];
        words[words.length-1] = temp;

        System.out.println(words[0]+" "+words[1]+","+" "+words[words.length-1]); // первый вариант

        words[words.length-1] = ","+words[words.length-1]; // второй вариант


        String modifiedSt = String.join(" ", words);

        System.out.println(modifiedSt);

    }
}
