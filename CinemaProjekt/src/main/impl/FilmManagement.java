package main.impl;

import main.dao.IFilm;
import main.model.Film;

import java.util.List;
import java.util.Scanner;

public class FilmManagement {
    public List<Film> filmList;
    Scanner in = new Scanner(System.in);

    public FilmManagement(List<Film> filmList) {
        this.filmList = filmList;
    }

    public void run() {
        while (true) {

            System.out.println("Movie management:");
            System.out.println("1. Add film");
            System.out.println("2. Remove film");
            System.out.println("3. View all movies");
            System.out.println("4. Return to main menu");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1: addFilm();break;
                case 2: removeFilm();break;
                case 3: viewAllMovies();break;
                case 4: return;
                default: System.out.println("Wrong choice!");
            }
        }
    }

    private void viewAllMovies() {
        for (Film film : filmList) {
            int i = 0;
            i++;
            System.out.println("#" + i);

            System.out.println("Movie name: "+film.getName());
            System.out.println("Duration: "+film.getDuration());
            System.out.println("Genre: "+film.getGenre());
            System.out.println("Rating: "+film.getRating());
            System.out.println("Description: "+film.getDescription());
            System.out.println("Language: "+film.getLanguage());
            System.out.println("_______________________");
        }
    }

    private void removeFilm() {
        System.out.println("Input movie name for removing: ");
        String filmToRemove = in.nextLine();
        if (filmToRemove != null) {
            filmList.remove(getFilmByName(filmToRemove));
        } else {
            System.out.println("No movie with this name was found.");
        }

    }

    private IFilm getFilmByName(String name) {
        for (IFilm film : filmList) {
            if (film.getName().equalsIgnoreCase(name)) {
                return film;
            }
        }
        return null;
    }

    private void addFilm() {
        System.out.println("Input movie name:");
        String name = in.nextLine();
        System.out.println("Input movie duration (min):");
        int duration = in.nextInt();
        in.nextLine();
        System.out.println("Input movie genre:");
        String genre = in.nextLine();
        System.out.println("Input movie rating:");
        String rating = in.nextLine();
        System.out.println("Input movie description:");
        String description = in.nextLine();
        System.out.println("Input movie language:");
        String language = in.nextLine();
        Film film = new Film(name,duration,rating,genre,description,language);
        filmList.add(film);
        System.out.println("Movie was successfully added!");
    }


}
