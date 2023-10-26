package main.model;

import main.dao.IProduct;

public class Product implements IProduct {
    String name;
    double price;
    String description;
    int stockQuantity;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getStockQuantity() {
        return stockQuantity;
    }

    @Override
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public void reduceStock(int quantity) {

    }

    @Override
    public void increaseStock(int quantity) {

    }
}
