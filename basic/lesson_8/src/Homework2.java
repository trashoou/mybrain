import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Бот помощник по сортировке мусора.");
// Используя оператор switch ... case написать бот,
// который помогает выбрасывать мусор в баки разных цветов:
// упаковки в желтый бак
// пищевые отходы в коричневый бак
// бумага в зеленый бак
// прочие отходы в черный бак
        Scanner in = new Scanner(System.in);

        System.out.println("Введите тип своего мусора: упаковка; пищевые отходы; бумага; прочие отходы.");
        String operation = in.nextLine();

        switch (operation) {
            case "упаковка" : {
                System.out.println("Упаковки выкидываются в желтый бак.");
                break;
            }
            case "пищевые отходы" : {
                System.out.println("Пищевые отходы выкидываются в коричневый бак.");
                break;
            }
            case "бумага" : {
                System.out.println("Бумага выкидывается в зеленый бак.");
                break;
            }
            case "прочие отходы" : {
                System.out.println("Прочие отходы выкидываются в черный бак.");
                break;
            }
            default: {
                System.out.println("Неверный ввод.");
            }
        }

    }

}

