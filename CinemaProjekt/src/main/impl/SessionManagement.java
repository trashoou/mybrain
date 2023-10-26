package main.impl;

import main.dao.ICinemaHall;
import main.dao.IFilm;
import main.model.CinemaHall;
import main.model.Film;
import main.model.Session;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SessionManagement {
    Scanner in = new Scanner(System.in);

    private List<Film> filmList = new ArrayList<>();
    private List<Session> sessions = new ArrayList<>();
    private List<CinemaHall> cinemaHallList = new ArrayList<>();



    public SessionManagement(List<Film> filmList, List<Session> sessions, List<CinemaHall> cinemaHallList) {
        this.filmList = filmList;
        this.sessions = sessions;
        this.cinemaHallList = cinemaHallList;
    }


    public List<IFilm> getFilms() {
        return new ArrayList<>(filmList);
    }

    public List<Session> getSessions() {
        return sessions;
    }

//    public List<IFilm> getAvailableFilms() {
//        List<IFilm> availableFilms = new ArrayList<>();
//        if (films != null) {
//            availableFilms.addAll(films);
//        }
//        return availableFilms;
//    }

    public List<ICinemaHall> getCinemaHalls() {
        List<ICinemaHall> cinemaHalls = new ArrayList<>();
        cinemaHalls.addAll(cinemaHallList);
        return cinemaHalls;
    }

    public void run() {
        while (true) {
            System.out.println("Session management:");
            System.out.println("1. Create session");
            System.out.println("2. Remove session");
            System.out.println("3. View all sessions");
            System.out.println("4. Return to main menu");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {

                case 1:
                    List<IFilm> films = getFilms();
                    List<ICinemaHall> cinemaHalls = getCinemaHalls();
                    addSession(films,cinemaHalls);
                    break;
                case 2: removeSession(); break;
                case 3: viewAllSessions(); break;
                case 4: return;
            }
        }
    }

    private void addSession(List<IFilm> films, List<ICinemaHall> halls) {
        System.out.println("Available films:");
        int filmsPerLine = 5; // Количество фильмов в одной строке
        for (int i = 0; i < films.size(); i++) {
            int j = 0;
            j++;
            System.out.print("#"+j+" "+films.get(i).getName() + " | ");
            if ((i + 1) % filmsPerLine == 0) {
                System.out.println(); // Перенос строки после указанного числа фильмов
            }
        }
        System.out.println();
        System.out.println("Input your choice:");
        int filmChoice = in.nextInt();

        System.out.println("Available halls:");
        for (CinemaHall hall : cinemaHallList) {
            System.out.println("Hall number:" + hall.getHallNumber() + " Hall capacity: " + hall.getCapacity() + " Hall type: " + hall.getHallType());
        }

        System.out.println("Input your choice:");
        int hallChoice = in.nextInt();
        in.nextLine();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Input start time (HH:mm):");
        String startTimeInput = in.nextLine();


        LocalTime startTime = null;
        try {
            startTime = LocalTime.parse(startTimeInput, timeFormatter);
            System.out.println("Start time: " + startTime);
        } catch (Exception e) {
            System.out.println("Invalid time format. Please use HH:mm format.");
        }

        IFilm film = films.get(filmChoice - 1);
        ICinemaHall cinemaHall = halls.get(hallChoice - 1);

        int durationMovieTime = film.getDuration();
        LocalTime endTime = startTime.plusMinutes(durationMovieTime);

        Session session = new Session(film,cinemaHall,startTime,endTime);
        sessions.add(session);
        System.out.println("Session was successfully added!");
    }

    private void removeSession() {

        sessions = getSessions();
        int i = 0;
        for (Session session : sessions) {
            System.out.println(i+1+"."+session);
        }
        System.out.println("Choice session to remove it.");
        int sessionToRemove = in.nextInt();
        sessions.remove(sessions.get(sessionToRemove-1));
    }
    private void viewAllSessions() {
        sessions = getSessions();
        int i = 0;
        for (Session session : sessions) {
            System.out.println(i+1+"."+session);
        }
    }




}
