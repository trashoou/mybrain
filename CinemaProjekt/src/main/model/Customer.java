package main.model;

import main.dao.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Customer implements ICustomer {
    private String username;
    private String password;
    private List<IOrder> orderHistory;
    private List<ITicket> bookingHistory;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
        this.orderHistory = new ArrayList<>();
        this.bookingHistory = new ArrayList<>();
    }

    @Override
    public ITicket bookTicket(ISession session) throws CustomException {
        LocalTime currentTime = LocalTime.now();
        LocalTime sessionStartTime = session.getStartTime();
        if (currentTime.isBefore(sessionStartTime)) {
            ITicket ticket = new Ticket(session,5.00,"Booked");
            session.addTicket(ticket);
            bookingHistory.add(ticket);
            return ticket;
        } else {
            throw new CustomException("You late! The session has already begun!");
        }
    }

    @Override
    public IOrder purchaseProduct(IProduct product, int quantity) throws CustomException {
        if (quantity <= product.getStockQuantity())
        {
            IOrder order = new Order();
            order.addProduct(product,quantity);
            product.reduceStock(quantity);
            orderHistory.add(order);
            return order;
        } else {
            throw new CustomException("Unfortunately, we do not have this product in stock in the quantity you need!");
        }
    }

    @Override
    public List<IOrder> getOrderHistory() {
        return orderHistory;
    }

    @Override
    public List<ITicket> getBookingHistory() {
        return bookingHistory;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
