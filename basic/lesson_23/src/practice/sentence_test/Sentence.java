package practice.sentence_test;

public class Sentence {
    // поля класса

    private String sentence;

    // конструктор

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    // методы класса


    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }



    @Override
    public String toString() {
        return "Sentence{" +
                "sentence='" + sentence + '\'' +
                '}';
    }

    // метод 1 - кол-во слов
    public int wordsInSentence (String sentence) {
        String[] words = sentence.split(" ");
        int qWords = words.length;
        System.out.println("There are "+qWords+" words in the sentence.");
        return qWords;
    }

    // метод 2 - кол-во букв
    public int lettersInSentence (String sentence) {
        String[] letters = sentence.replaceAll("[^а-яА-Яa-zA-Z0-9]", "").split("");
        System.out.println("There are "+letters.length+" letters in the sentence.");
        return letters.length;
    }

}