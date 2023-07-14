package practice.string;

public class PracticeString {
    public static void main(String[] args) {
        String str = "Ich liebe Java seehr stark!";
        System.out.println("String: "+str);

        String[] words = str.split(" ");
        int n = words.length;
        System.out.println("Number of words in String: "+n);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        String[] simbols = str.split("");
        int m = words.length;
        System.out.println("Number of words in String: "+m);

        for (int i = 0; i < simbols.length; i++) {
            System.out.print(simbols[i]+" | ");
        }

    }
}
