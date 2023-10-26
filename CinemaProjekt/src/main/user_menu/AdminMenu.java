package main.user_menu;

import main.impl.FilmManagement;
import main.impl.HallManagement;
import main.impl.SessionManagement;
import main.model.CinemaHall;
import main.model.Film;
import main.model.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminMenu {
    private List<Film> films = new ArrayList<>();
    private List<Session> sessions = new ArrayList<>();
    private List<CinemaHall> cinemaHallList = new ArrayList<>();
    private static final String adminLogin = "Admin";
    private static final String adminPassword = "Password";

    private boolean isAuthenticated = false;

    // Метод для аутентификации
    public boolean authenticate(String inputLogin, String inputPassword) {
        isAuthenticated = adminLogin.equals(inputLogin) && adminPassword.equals(inputPassword);
        return isAuthenticated;
    }

    // Метод для запуска меню управления администратора
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (!isAuthenticated) {
                System.out.println("Please log in as an administrator.");
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                if (authenticate(username, password)) {
                    System.out.println("Authentication successful. Welcome, Admin!");
                } else {
                    System.out.println("Authentication failed. Please try again.");
                }
            } else {
                // Здесь будет ваш код для меню управления администратора после успешной аутентификации
                System.out.println("Admin menu options:");
                System.out.println("1. Manage films");
                System.out.println("2. Manage sessions");
                System.out.println("3. Manage users");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Очищаем буфер после считывания числа

                switch (choice) {
                    case 1:
                        FilmManagement filmManagement = new FilmManagement(films);
                        filmManagement.run();
                        break;
                    case 2:
                        SessionManagement sessionManagement = new SessionManagement(films,sessions,cinemaHallList);
                        sessionManagement.run();
                        break;
                    case 3:
                        HallManagement hallManagement = new HallManagement(cinemaHallList);
                        hallManagement.run();
                        break;
                    case 4:
                        System.out.println("Exiting Admin Menu.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

    public static void main(String[] args) {
        AdminMenu adminMenu = new AdminMenu();
        adminMenu.run();
    }
}

