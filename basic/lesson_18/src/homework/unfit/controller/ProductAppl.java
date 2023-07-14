package homework.unfit.controller;

import homework.unfit.model.Product;

public class ProductAppl {
    public static void main(String[] args) {
        Product[] products = new Product[6];
        products[0] = new Product("Мяско",true);
        products[1] = new Product("Груша",false);
        products[2] = new Product("Вишня",true);
        products[3] = new Product("Йогурт",true);
        products[4] = new Product("Молоко",false);
        products[5] = new Product("Мяско",true);

        System.out.println("Проверка двух объектов:");
        System.out.println(products[0]==products[5]);
        System.out.println("Проверка двух объектов с 'equals':");
        System.out.println(products[0].equals(products[5]));
        System.out.println();
        printProducts(products);
        System.out.println("_____________________");
        printBadProducts(products);
    }
    //______________Methods__________
    public static void printBadProducts (Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].bad()) {
                System.out.println(products[i]);
            }
        }
    }
    public static void printProducts (Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
