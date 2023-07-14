package homework.product.model;

public class Food extends Product {
    private boolean isOutOfDate;

    public Food(double price, String name, long barCode, boolean isOutOfDate) {
        super(price, name, barCode);
        this.isOutOfDate = isOutOfDate;
    }


    @Override
    public String toString() {
        return "Цена продукта: " + getPrice() + '\n' +
                "Наименование продукта: " + getName() + '\n' +
                "Номер продукта: " + getBarCode() + '\n' +
                "Просрочен ли продукт: " + isOutOfDate() + '\n';
    }
    public boolean isOutOfDate() {
        return isOutOfDate;
    }
}
