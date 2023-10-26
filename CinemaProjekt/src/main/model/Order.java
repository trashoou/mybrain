package main.model;

import main.dao.IOrder;
import main.dao.IProduct;
import main.dao.ITicket;

import java.util.List;

public class Order implements IOrder {
    private List<ITicket> tickets;
    private List<IProduct> products;
    private String status;

    @Override
    public List<ITicket> getTickets() {
        return null;
    }

    @Override
    public void addTicket(ITicket ticket) {

    }

    @Override
    public void removeTicket(ITicket ticket) {

    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (ITicket ticket : tickets) {
            totalPrice += ticket.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void pay() {
        status = "Paid";
        for (ITicket ticket : tickets) {
            ticket.setStatus("Paid");
        }
    }

    @Override
    public void addProduct(IProduct product, int quantity) {

    }
}
