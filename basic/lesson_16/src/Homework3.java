public class Homework3 {
    public static void main(String[] args) {
//Сформируйте массив, который хранит названия дней недели при условии,
// что первый рабочий день недели - это Понедельник, а последний - Воскресенье.
// Переопределите этот массив так, чтобы первым рабочим днем недели стало Воскресенье,
// а последним - Суббота.

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Original array:");
        printArray(daysOfWeek);

        // Переопределение массива с первым рабочим днем - Воскресеньем, а последним - Субботой
        String firstDay = daysOfWeek[6]; // Воскресенье
        String lastDay = daysOfWeek[5]; // Суббота

        // Перестановка элементов массива
        for (int i = 6; i > 0; i--) {
            daysOfWeek[i] = daysOfWeek[i - 1];
        }
        daysOfWeek[0] = firstDay;
        daysOfWeek[6] = lastDay;

        System.out.println("Modified array:");
        printArray(daysOfWeek);
    }

    private static void printArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
        System.out.println();
    }
}


