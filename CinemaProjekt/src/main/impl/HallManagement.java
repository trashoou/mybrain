package main.impl;

import main.model.CinemaHall;
import main.model.HallType;
import main.model.Session;

import java.util.List;
import java.util.Scanner;

public class HallManagement {

    Scanner in = new Scanner(System.in);
    List<CinemaHall> hallList;

    public HallManagement(List<CinemaHall> hallList) {
        this.hallList = hallList;
    }

    public List<CinemaHall> getHallList() {
        return hallList;
    }

    public void run() {
        while(true) {
            System.out.println("Hall management:");
            System.out.println("1. Add hall");
            System.out.println("2. Remove hall");
            System.out.println("3. View list of halls");
            System.out.println("4. Return to main menu");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1 : addHall(); break;
                case 2 : removeHall(); break;
                case 3 : viewAllSessions(); break;
                case 4: return;
                default:
                    System.out.println("Wrong choice!");
            }


        }
    }

    private void viewAllSessions() {
        hallList = getHallList();
        for (CinemaHall hall : hallList) {
            System.out.println("Hall number:" + hall.getHallNumber() + " Hall capacity: " + hall.getCapacity() + " Hall type: " + hall.getHallType());
        }
    }

    private void removeHall() {
        System.out.println("Input hall number to remove it:");
        int hallToRemove = in.nextInt();
        hallList.remove(hallToRemove-1);
        System.out.println("Cinema hall was successfully removed!");
    }

    private void addHall() {
        System.out.println("Input hall number: ");
        int hallNumber = in.nextInt();
        in.nextLine();
        System.out.println("Input hall capacity: ");
        int hallCapacity = in.nextInt();
        in.nextLine();
        System.out.println("1. "+ HallType._3D+" | "+"2. "+HallType._2D+" | "+"3. "+HallType.IMAX);
        int hallChoice = in.nextInt();
        in.nextLine();

        HallType hallType = HallType._2D;
        switch (hallChoice) {
            case 1 : hallType = HallType._3D; break;
            case 2 : hallType = HallType._2D; break;
            case 3 : hallType = HallType.IMAX; break;
            default:
                System.out.println("Wrong choice!");
        }
        CinemaHall cinemaHall = new CinemaHall(hallNumber,hallCapacity,hallType);
        hallList.add(cinemaHall);
        System.out.println("Cinema hall was successfully added!");
    }
}
