package practice.coffee;

import java.util.Scanner;

public class CoffeeMashine {

    public static void main(String[] args) {

        System.out.println("Welcome to our Coffee Shop!");

        // предложить меню
        Coffee[] menu = Coffee.values();
        for (Coffee coffee_menu : Coffee.values()) {
            System.out.println(coffee_menu.ordinal()+1+". "+coffee_menu.name().replace("_"," ").toLowerCase()+": "+coffee_menu.getPrice()+"€ | "+ coffee_menu.getVolume()+" ml.");
        }
        // понять выбор пользователя
        System.out.println("Input number of your choice: ");
        Scanner scanner  = new Scanner(System.in);
        int choice = scanner.nextInt();
        // объявить цену и предложить оплатить
        switch (choice) {
            case 1: {
                System.out.println("Your choice is: "+menu[choice-1].name().replace("_"," ").toLowerCase());
                System.out.println("The price is: "+menu[choice-1].getPrice()+"€");
            }
            case 2: {
                System.out.println("Your choice is: "+menu[choice-1].name().replace("_"," ").toLowerCase());
                System.out.println("The price is: "+menu[choice-1].getPrice()+"€");
            }
            case 3: {
                System.out.println("Your choice is: "+menu[choice-1].name().replace("_"," ").toLowerCase());
                System.out.println("The price is: "+menu[choice-1].getPrice()+"€");
            }
            case 4: {
                System.out.println("Your choice is: "+menu[choice-1].name().replace("_"," ").toLowerCase());
                System.out.println("The price is: "+menu[choice-1].getPrice()+"€");
            }
            case 5: {
                System.out.println("Your choice is: "+menu[choice-1].name().replace("_"," ").toLowerCase());
                System.out.println("The price is: "+menu[choice-1].getPrice()+"€");
            }
            default: {
                System.out.println("Wrong choice!");
            }

        }

    }
}
