package homework.bank.model;

import java.util.Scanner;

import static java.lang.System.exit;

public class Bank extends Application {
    String nameBank;
    String owner;
    double balance;
    long account;


    public Bank(String name, String version, String developer, String nameBank, String owner, double balance, long account) {
        super(name, version, developer);
        this.nameBank = nameBank;
        this.owner = owner;
        this.balance = balance;
        this.account = account;
    }

    public Bank(String owner, double balance, long account) {
        this.owner = owner;
        this.balance = balance;
        this.account = account;
    }

    public void deposit (double sum) {
        balance = balance+sum;
    }
    public double withdraw (double sum) {
        if (sum <= balance) {
            balance = balance - sum;
        } else {
            System.out.println("Fail");
        }
        return sum;
    }
    public void display () {
        System.out.println("Ваш баланс составляетя: "+balance);
    }

    public void function () {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите нужную вам функцию.");
        System.out.println("Ввод 1 = позволяет снять деньги со счета.");
        System.out.println("Ввод 2 = позволяет положить деньги на счет.");
        System.out.println("Ввод 3 = показывает ваш баланс.");
        System.out.println("Ввод 4 = выходит из учетной записи.");
        String operation = in.nextLine();

        switch (operation) {
            case "1" : {
                System.out.println("Введите сумму которую хотели бы снять");
                System.out.println("Вы можете снимать: 50, 100, 200, 300, 400");
                int input = in.nextInt();
                switch (input) {
                    case 50 : {
                        withdraw(50);
                        display();
                        break;
                    }
                    case 100 : {
                        withdraw(100);
                        display();
                        break;
                    }
                    case 200 : {
                        withdraw(200);
                        display();
                        break;
                    }
                    case 300 : {
                        withdraw(300);
                        display();
                        break;
                    }
                    case 400 : {
                        withdraw(400);
                        display();
                        break;
                    }
                }
                break;
            }
            case "2" : {
                System.out.println("Введите сумму которую хотели бы положить на свой счет");
                System.out.println("Вы можете класть на счет: 50, 100, 200, 300, 400");
                int input = in.nextInt();
                switch (input) {
                    case 50 : {
                        deposit(50);
                        display();
                        break;
                    }
                    case 100 : {
                        deposit(100);
                        display();
                        break;
                    }
                    case 200 : {
                        deposit(200);
                        display();
                        break;
                    }
                    case 300 : {
                        deposit(300);
                        display();
                        break;
                    }
                    case 400 : {
                        deposit(400);
                        display();
                        break;
                    }
                }
                break;
            }
            case "3" : {
                display();
                break;
            }
            case "4" : {
                System.out.println("Вы вышли из системы.");
                exit(0);
                break;
            }
            default: {
                System.out.println("Неверный ввод.");
            }
        }
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }
}
