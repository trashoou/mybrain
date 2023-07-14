package homework.unfit.model;

import java.util.Objects;

public class Product {
    public String name;
    public boolean isOutOfDate;

    public boolean bad() {
        return isOutOfDate;
    }

    public Product(String name, boolean isOutOfDate) {
        this.name = name;
        this.isOutOfDate = isOutOfDate;
    }

    @Override
    public String toString() {
        return "Наименование продукта: "+name + '\n' +
                "Просрочен ли продукт: "+isOutOfDate+ '\n';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return isOutOfDate == product.isOutOfDate && Objects.equals(name, product.name);
    }
}
