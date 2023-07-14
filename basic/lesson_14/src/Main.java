public class Main {
    public static void main(String[] args) {
        int totalPelmenCount = 30;
        int extraWeight = 15;

        // Генерируем случайный номер счастливого пельменя
        int luckyPelmenNumber = (int) (Math.random() * totalPelmenCount) + 1;

        // Поиск счастливого пельменя
        for (int i = 1; i <= totalPelmenCount; i++) {
            int weight = 0;
            if (i == luckyPelmenNumber) {
                weight += extraWeight;
                System.out.println("Счастливый пельмень: " + i);
            }
            System.out.println("Пельмень " + i + " | Вес: " + weight + " грамм");
        }
    }
}
