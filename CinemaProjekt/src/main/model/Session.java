package main.model;

import main.dao.ICinemaHall;
import main.dao.IFilm;
import main.dao.ISession;
import main.dao.ITicket;


import java.time.LocalTime;
import java.util.List;

public class Session implements ISession {
    IFilm film;
    ICinemaHall hall;
    LocalTime startTime;
    LocalTime endTime;

    private List<ITicket> tickets;

    public Session(IFilm film, ICinemaHall hall, LocalTime startTime, LocalTime endTime) {
        this.film = film;
        this.hall = hall;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Session(IFilm film, ICinemaHall hall, LocalTime startTime) {
        this.film = film;
        this.hall = hall;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Session" +
                "film=" + film +
                ", hall=" + hall +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", tickets=" + tickets +
                '}';
    }

    @Override
    public IFilm getFilm() {
        return film;
    }

    @Override
    public void setFilm(IFilm film) {
        this.film = film;
    }

    @Override
    public ICinemaHall getCinemaHall() {
        return hall;
    }

    @Override
    public void setCinemaHall(ICinemaHall cinemaHall) {
        this.hall = cinemaHall;
    }

    @Override
    public LocalTime getStartTime() {
        return startTime;
    }

    @Override
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public LocalTime getEndTime() {
        return endTime;
    }

    @Override
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public List<ITicket> getTickets() {
        return tickets;
    }

    @Override
    public void addTicket(ITicket ticket) {
        tickets.add(ticket);
    }

    @Override
    public void removeTicket(ITicket ticket) {
        tickets.remove(ticket);
    }
}
