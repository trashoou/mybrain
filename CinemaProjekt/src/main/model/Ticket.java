package main.model;

import main.dao.ISession;
import main.dao.ITicket;

import java.util.List;
import java.util.ArrayList;

public class Ticket implements ITicket {
    ISession session;
    int place;
    double price;
    String status;

    private static int nextAvailableSeat = 1;


    public Ticket(ISession session, double price, String status) {
        this.session = session;
        this.place = nextAvailableSeat;
        this.price = price;
        this.status = status;

        nextAvailableSeat++;
    }


    @Override
    public ISession getSession() {
        return session;
    }

    @Override
    public void setSession(ISession session) {
        this.session = session;
    }

    @Override
    public int getSeatNumber() {
        return place;
    }

    @Override
    public void setSeatNumber(int seatNumber) {
        this.place = seatNumber;
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
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}
