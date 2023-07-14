package homework.bank.controller;

import homework.bank.model.Application;
import homework.bank.model.Bank;
import homework.bank.model.SecureBank;

import java.util.Scanner;

public class BankAppl {

    public static void main(String[] args) {
        if (args.length > 0) {
            int receivedNumber = Integer.parseInt(args[0]);
            System.out.println("Получено число из первого приложения: " + receivedNumber);
            // Используйте полученное число в вашем приложении

        }
        Application bank = new Application("Volksbank","2.0","Dmitriy, Michail, Alexander");
        Bank acc1 = new Bank("Dmitriy",600,999123);
        Scanner in = new Scanner(System.in);
        System.out.println("Вход в систему");
        System.out.print("Введите логин: ");
        String login = in.next();
        System.out.print("Введите пароль: ");
        String password = in.next();
        SecureBank secureBank = new SecureBank(login, password);
        if (secureBank.checklog(secureBank.getLogin(), secureBank.getPassword())) { // Если пользователь вошел в систему...
            System.out.println("Введите код из приложения SecureBankAppl для получения доступа к функциям приложения:");
            int code = in.nextInt();
            if (code == 0) {
                acc1.function();
            } else System.out.println("Wrong input!");
        }
    }

}

