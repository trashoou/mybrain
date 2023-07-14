package homework.product.model;

public class MilkFood extends Food {
    private String milkType;
    private double fat;

    public MilkFood(double price, String name, long barCode, boolean isOutOfDate, String milkType, double fat) {
        super(price, name, barCode, isOutOfDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Цена продукта: " + getPrice() + '\n' +
                "Наименование продукта: " + getName() + '\n' +
                "Номер продукта: " + getBarCode() + '\n' +
                "Просрочен ли продукт: " + isOutOfDate() + '\n' +
                "Тип молока: " + milkType + '\n' +
                "Жирность молока: "+fat+'\n';
    }
}
