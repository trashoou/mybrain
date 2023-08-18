package homework.task.controller;


import homework.task.dao.ToDoListImpl;
import homework.task.model.Menu;
import homework.task.model.Task;

import java.util.Scanner;

public class ToDoAppl {
    public static void main(String[] args) {
        System.out.println("Welcome to ToDo Application!");
        Scanner scanner = new Scanner(System.in);


        ToDoListImpl toDoList = new ToDoListImpl(10); // capacity
        Task[] tasks = new Task[10];

        while(true) { // we start the loop so that the user can determine when to end the program
            System.out.println("\nМеню:");
            Menu.printMenu();

            System.out.println("Выберите пункт меню: ");
            int choice = scanner.nextInt(); // create an output for the user (choose an option from the menu)
            scanner.nextLine();

            switch (choice) {
                case 1:
                    toDoList.printTasks();
                    break;
                case 2:
                    toDoList.addTask();
                    break;
                case 3:
                    toDoList.findTask();
                    break;
                case 4:
                    toDoList.removeTask();
                    break;
                case 5:
                    System.out.println("Программа завершена.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Недопустимый выбор. Пожалуйста, выберите пункт из меню.");
            }
        }
    }
}
