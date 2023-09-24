package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hw {
    public Map<String, String> wordMap;
    public Map<String, Integer> mistakeCountMap;

    public Hw() {
        wordMap = new HashMap<>();
        mistakeCountMap = new HashMap<>();
    }

    // Добавление слова и его перевода в wordMap
    public void addWord(String word, String translation) {
        wordMap.put(word, translation);
        mistakeCountMap.put(word, 0); // Изначально количество ошибок равно 0
    }


    // Получение перевода слова
    public String getTranslation(String word) {
        return wordMap.get(word);
    }

    // Увеличение счетчика ошибок для слова
    public void incrementMistakeCount(String word) {
        if (mistakeCountMap.containsKey(word)) {
            int count = mistakeCountMap.get(word);
            mistakeCountMap.put(word, count + 1);
        }
    }

    // Получение количества ошибок для слова
    public int getMistakeCount(String word) {
        return mistakeCountMap.getOrDefault(word, 0);
    }

    // Получение списка слов с неправильными ответами
    public Map<String, String> practiceDifficultWords() {
        Map<String, String> difficultWords = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mistakeCountMap.entrySet()) {
            if (entry.getValue() > 0) {
                difficultWords.put(entry.getKey(), wordMap.get(entry.getKey()));
            }
        }
        return difficultWords;
    }

    public static void main(String[] args) {
        Hw card = new Hw();
        card.addWord("hello", "привет");
        card.addWord("book", "книга");
        card.addWord("tree", "дерево");

        // Получение перевода слов
        Set<String> keys = card.wordMap.keySet();

        for (String word : keys) {
            String translation = card.getTranslation(word);
            System.out.println("Слово: " + word + ", Перевод: " + translation);
        }

        for (int i = 0; i < 2; i++) {
            card.incrementMistakeCount("hello");
        }
        for (int i = 0; i < 5; i++) {
            card.incrementMistakeCount("book");
        }
        System.out.println("==========");

        // Получение словаря с неправильными ответами
        Map<String, String> difficultWords = card.practiceDifficultWords();
        System.out.println("Слова с неправильными ответами:");
        for (Map.Entry<String, String> entry : difficultWords.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " | Кол-во ошибок: "+card.getMistakeCount(entry.getKey()));
        }
    }
}

