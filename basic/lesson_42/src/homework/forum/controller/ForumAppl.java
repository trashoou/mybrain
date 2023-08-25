package homework.forum.controller;

import homework.forum.dao.ForumImpl;
import homework.forum.model.Menu;
import homework.forum.model.Post;


import java.io.*;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ForumAppl {
    public static Menu getMenuByItem(int item) {
        for (Menu menu : Menu.values()) {
            if (menu.getMenuByItem() == item) {
                return menu;
            }
        }
        return null;
    }

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ForumImpl forum = new ForumImpl(100);

        Post[] posts = new Post[100];

        while (true) { // we start the loop so that the user can determine when to end the program
            System.out.println("\nMenu:");
            Menu.printMenu();

            System.out.println("Select menu item: ");
            int choice = scanner.nextInt(); // create an output for the user (choose an option from the menu)
            scanner.nextLine();

            Menu selectedMenu = getMenuByItem(choice);
            if (selectedMenu != null) {
                switch (selectedMenu) {
                    case ADD_POST:
                        System.out.println("Input id:");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Input title:");
                        String title = scanner.nextLine();
                        System.out.println("Input your nickname:");
                        String author = scanner.nextLine();
                        System.out.println("Throw content:");
                        String content = scanner.nextLine();
                        Post newPost = new Post(id,title,author,content);
                        forum.addPost(newPost);
                        break;
                    case REMOVE_POST:
                        System.out.println("Input post ID to remove it.");
                        id = scanner.nextInt();
                        forum.removePost(id);
                        break;
                    case UPDATE_POST:
                        System.out.println("Input post ID to update id.");
                        id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Set new content:");
                        content = scanner.nextLine();
                        forum.updatePost(id,content);
                        break;
                    case GET_POST_BY_ID:
                        System.out.println("Input post ID to find it.");
                        id = scanner.nextInt();
                        forum.getPostById(id);
                        break;
                    case GET_POSTS_BY_AUTHOR:
                        System.out.println("Input author name to find posts from him.");
                        author = scanner.nextLine();
                        forum.getPostsByAuthor(author);
                        break;
                    case GET_POSTS_BY_AUTHOR_DATE:
                        System.out.println("Input author name to find posts from him.");
                        author = scanner.nextLine();
                        System.out.println("Input which date do u wanna search:");
                        String dateFrom = scanner.nextLine();
                        System.out.println("Input end of date:");
                        String dateTo = scanner.nextLine();
                        LocalDateTime ldFrom = dateParse(dateFrom);
                        LocalDateTime ldTo = dateParse(dateTo);
                        forum.getPostsByAuthor(author,ldFrom,ldTo);
                        break;
                    case EXIT:
                        System.out.println("Programme successful ended!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Wrong input. Please choice item from menu!");
                }
            }
        }
    }
    private static LocalDateTime dateParse(String date) {
        //DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
        return LocalDateTime.parse(date, df);
    }
}
