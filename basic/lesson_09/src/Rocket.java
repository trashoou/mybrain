public class Rocket {
    public static void main(String[] args) {
        //Запустить обратный отсчет старта ракеты от 10 до 0.
        // Последнее сообщение: "Поехали!...".

        int count_down = 10; // параметр цикла

        while (count_down != 0) {
            System.out.println("To start the rocket left: "+count_down);
            count_down--; // изменяем параметр цикла

        }
        System.out.println("Поехали!...");
    }
}
