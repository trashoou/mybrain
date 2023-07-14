package homework.book.model;

public class Dictionary extends Book {
    public String language;
    public int capacityOfWords;

    public Dictionary(long isbn, String title, String author, int yearOfPublishing, String language, int capacityOfWords) {
        super(isbn, title, author, yearOfPublishing);
        this.language = language;
        this.capacityOfWords = capacityOfWords;
    }

    public Dictionary(long isbn, String title, int yearOfPublishing, String language, int capacityOfWords) {
        super(isbn, title, yearOfPublishing);
        this.language = language;
        this.capacityOfWords = capacityOfWords;
    }

    public void display () {
        super.display();
        System.out.println("Language: "+language+" capacity of words: "+capacityOfWords);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getCapacityOfWords() {
        return capacityOfWords;
    }

    public void setCapacityOfWords(int capacityOfWords) {
        this.capacityOfWords = capacityOfWords;
    }
}
