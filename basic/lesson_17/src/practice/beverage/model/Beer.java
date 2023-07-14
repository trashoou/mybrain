package practice.beverage.model;

public class Beer extends Beverage {
    String type; // white or dark
    // конструктор
    public Beer(String title, String packing, int quantity, String type) {
        super(title, packing, quantity);
        this.type = type;
    }

    public Beer(String title, String packing, int quantity) {
        super(title, packing, quantity);
    }

    public Beer() {
    }

    // метод для закупки
    // мы переопределили родительский метод
    public void toBuy (String title, String packing, int quantity, String type) {
        super.toBuy(title, packing, quantity);
        this.type = type;
    }


    // метод для показа того, что в кладовке
    // мы переопределили родительский метод
    public void displayStock () {
        super.displayStock();
        System.out.println("This is "+type+ " beer.");
    }
}
