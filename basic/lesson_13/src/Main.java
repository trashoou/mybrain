public class Main {
    public static void main(String[] args) {
//Задача 1.
// Имеются оценки абитуриента из его аттестата, всего 12 оценок.
// Найдите средний балл абитуриента.
        System.out.println("Average marks of students");
        int[] array = {5,3,3,4,5,3,4,5,4,5,3,3};
        double sum = 0; // создаем переменную для накопления суммы.
        //Для нахождения среднего балла первым шагом будет суммирование всех оценок.
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i]; // здесь суммируем оценки.
        }
        // Для нахождения среднего балла делим сумму оценок на их кол-во(12).
        double result = sum / array.length; // здесь находим средний балл оценок.
        System.out.println("Средний балл абитуриента: "+result); // выводим результат пользователю.
        System.out.printf("Средний балл абитуриента: %.0f",result);
        System.out.println();
        System.out.printf("Средний балл абитуриента: %.01f",result);
        System.out.println();
        System.out.printf("Средний балл абитуриента: %.02f",result);
    }
}