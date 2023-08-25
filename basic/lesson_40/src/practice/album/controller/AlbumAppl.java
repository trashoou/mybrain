package practice.album.controller;

import practice.album.dao.AlbumImpl;
import practice.album.model.Photo;
import practice.album.model.Menu;


import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlbumAppl {

    private static AlbumImpl album = new AlbumImpl(100);
    private static Scanner scanner = new Scanner(System.in);

    private static Photo parsePhotoFromString(String line) {
        // Здесь разберите строку и извлеките значения для создания объекта Photo
        // Примерно так, используя регулярное выражение:
        Pattern pattern = Pattern.compile("Photo\\{albumId=(\\d+), photoId=(\\d+), title='(.*?)', url='(.*?)', date=(.*?)\\}");
        Matcher matcher = pattern.matcher(line);

        if (matcher.find()) {
            int albumId = Integer.parseInt(matcher.group(1));
            int photoId = Integer.parseInt(matcher.group(2));
            String title = matcher.group(3);
            String url = matcher.group(4);
            LocalDateTime date = LocalDateTime.parse(matcher.group(5)); // Проверьте формат даты
            return new Photo(albumId, photoId, title, url, date);
        } else {
            return null; // Если строка не соответствует ожидаемому формату
        }
    }

    private static void readPhotosFromFile() {
        System.out.print("Enter the file name to read photos from: ");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                Photo photo = parsePhotoFromString(line); // Метод для разбора строки и создания объекта Photo
                if (photo != null) {
                    album.addPhoto(photo); // Добавляем фото в альбом
                }
            }
            System.out.println("Photos are read from the file " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }


    private static void savePhotosToFile() {


        System.out.print("Enter a file name to save the photos: ");
        String fileName = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Photo photo : album.getAllPhotos()) {
                if (photo != null) {
                    writer.write(photo.toString());
                    writer.newLine();
                }
            }
            System.out.println("Photos are saved to a file " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving photos: " + e.getMessage());
        }
    }
    private static LocalDate dateParse(String date) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
        return LocalDate.parse(date, df);
    }

    public static Menu getMenuByItem(int item) {
        for (Menu menu : Menu.values()) {
            if (menu.getMenuItem() == item) {
                return menu;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to ToDo Application!");

        Photo[] tasks = new Photo[100];

        while(true) { // we start the loop so that the user can determine when to end the program
            System.out.println("\nМеню:");
            Menu.printMenu();

            System.out.println("Выберите пункт меню: ");
            int choice = scanner.nextInt(); // create an output for the user (choose an option from the menu)
            scanner.nextLine();

            Menu selectedMenu = getMenuByItem(choice);
            if (selectedMenu != null) {
                switch (selectedMenu) {
                    case GET_PHOTO_FROM_ALBUM:
                        System.out.println("Введите номер альбома:");
                        int getAlbumId = scanner.nextInt();
                        System.out.println("Введите номер фото:");
                        int getPhotoId = scanner.nextInt();
                        album.getPhotoFromAlbum(getPhotoId,getAlbumId);
                        break;
                    case GET_ALL_PHOTO_FROM_ALBUM:
                        System.out.println("Введите номер альбома:");
                        int getAllPhotoAlbumId = scanner.nextInt();
                        album.getAllPhotoFromAlbum(getAllPhotoAlbumId);
                        break;
                    case GET_PHOTO_BETWEEN_DATE:
                        System.out.println("Введите дату 'С' (гггг/мм/дд):");
                        String dateFrom = scanner.nextLine();
                        System.out.println("Введите дату 'До' (гггг/мм/дд):");
                        String dateTo = scanner.nextLine();
                        album.getPhotoBetweenDate(dateParse(dateFrom),dateParse(dateTo));
                        break;

                    case ADD:
                        System.out.println("Введите номер альбома для новой фотографии:");
                        int createAlbumId = scanner.nextInt();
                        System.out.println("Введите номер фото:");
                        int createPhotoId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Введите название фото:");
                        String createTitlePhoto = scanner.nextLine();
                        System.out.println("Закиньте url-ссылку на фото:");
                        String urlPhoto = scanner.nextLine();
                        Photo newPhoto = new Photo(createAlbumId,createPhotoId,createTitlePhoto,urlPhoto,LocalDateTime.now());
                        album.addPhoto(newPhoto);
                        break;
                    case REMOVE:
                        System.out.println("Введите номер альбома:");
                        int albumId = scanner.nextInt();
                        System.out.println("Введите номер фото:");
                        int photoId = scanner.nextInt();
                        album.removePhoto(photoId,albumId);
                    case UPDATE:
                        System.out.println("Введите номер обновляемого альбома:");
                        int updateAlbumId = scanner.nextInt();
                        System.out.println("Введите номер обновляемого фото:");
                        int updatePhotoId = scanner.nextInt();
                        System.out.println("Закиньте новую url-ссылку для обновления фото.");
                        String updateUrlPhoto = scanner.nextLine();
                        album.updatePhoto(updatePhotoId,updateAlbumId,updateUrlPhoto);
                    case SAVE:
                        savePhotosToFile();
                        break;
                    case READ:
                        readPhotosFromFile();
                        break;
                    case EXIT:
                        System.out.println("Программа завершена.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Недопустимый выбор. Пожалуйста, выберите пункт из меню.");
                }
            }

        }
    }
}


