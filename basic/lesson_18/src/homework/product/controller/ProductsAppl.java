package homework.product.controller;

import homework.product.model.Product;
import homework.product.model.Food;
import homework.product.model.MeatFood;
import homework.product.model.MilkFood;

public class ProductsAppl {
    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new MeatFood(3.99, "Chicken", 987654321, true, "Poultry");
        products[1] = new MilkFood(1.99, "Milk", 567890123, false, "Cow", 2.5);
        products[2] = new Food(4.99,"Apple",421421,false);

        printArray(products);

        double total = calculateTotalPrice(products);
        System.out.println("Total price of all products: " + total);

    }
    public static double calculateTotalPrice(Product[] products) {
        double total = 0.0;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            total += product.getPrice();
        }
        return total;
    }

    public static void printArray (Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
