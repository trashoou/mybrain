package homework.bank.controller;
import homework.bank.model.Application;
import homework.bank.model.SecureBank;
import java.util.Scanner;


public class SecureBankAppl {

    protected static int generatedNumber;
    String login;
    String password;

    public static void main(String[] args) {

        Application bank = new Application("Volksbank","2.0","Dmitriy, Michail, Alexander");
        Scanner in = new Scanner(System.in);
        System.out.println("Вход в систему");
        System.out.print("Введите логин: ");
        String login = in.next();
        System.out.print("Введите пароль: ");
        String password = in.next();
        SecureBank secureBank = new SecureBank(login, password);
        if (secureBank.checklog(secureBank.getLogin(), secureBank.getPassword())) { // Если пользователь вошел в систему выводим сгенерированный код.
            generatedNumber = SecureBank.generateSixDigitNumber();// Сохраняем сгенерированное число в статическую переменную класса
            String[] command = {"java", "-jar", "second_app.jar", String.valueOf(generatedNumber)};
            try {
                ProcessBuilder processBuilder = new ProcessBuilder(command);
                processBuilder.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Generated number: " + generatedNumber);
            String finish = in.next();
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public static int getGeneratedNumber() {
        return generatedNumber;
    }
}

