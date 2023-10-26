package main.model;

import main.dao.*;

import java.time.LocalTime;

public class Administrator implements IAdministrator {
    private String username;
    private String password;

    public Administrator(String username, String password) {
        this.username = username;
        this.password = password;
    }



    @Override
    public IFilm createFilm(String name, int duration) {
        return new Film(name, duration);
    }

    @Override
    public ISession createSession(IFilm film, ICinemaHall hall, LocalTime dateTime) {
        return new Session(film,hall,dateTime);
    }

    @Override
    public IProduct createProduct(String name, double price, String description, int stockQuantity) {
        return null;
    }

    @Override
    public void deleteFilm(IFilm film) {

    }

    @Override
    public void deleteSession(ISession session) {

    }

    @Override
    public void deleteProduct(IProduct product) {

    }

    @Override
    public String generateTicketSalesReport(String startDate, String endDate) {
        return null;
    }

    @Override
    public String generateProductSalesReport(String startDate, String endDate) {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public void setUsername(String username) {

    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void setPassword(String password) {

    }
}
