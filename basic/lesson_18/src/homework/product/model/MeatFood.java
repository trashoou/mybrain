package homework.product.model;

public class MeatFood extends Food {
    private String meatType;

    public MeatFood(double price, String name, long barCode, boolean isOutOfDate, String meatType) {
        super(price, name, barCode, isOutOfDate);
        this.meatType = meatType;
    }


    @Override
    public String toString() {
        return "Цена продукта: " + getPrice() + '\n' +
                "Наименование продукта: " + getName() + '\n' +
                "Номер продукта: " + getBarCode() + '\n' +
                "Просрочен ли продукт: " + isOutOfDate() + '\n' +
                "Тип мяса: " + meatType + '\n';
    }
}
