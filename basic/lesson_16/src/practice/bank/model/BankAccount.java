package practice.bank.model;
import java.util.Scanner;
public class BankAccount {
    private long account; // номер счета
    private String owner; // владелец счета
    private String bank; // банк
    private int branch; // филиал
    private double balance; // баланс

    // методы класса
    // конструктор класса

    public BankAccount(long account, String owner, String bank, int branch, double balance) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
    }
    // конструктор без баланса
    public BankAccount(long account, String owner, String bank, int branch) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
    }
    // конструктор без владельца
    public BankAccount(long account, String bank, int branch, double balance) {
        this.account = account;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
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

    public void herznaet () {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите нужную вам функцию.");
        System.out.println("Ввод 1 = позволяет снять деньги со счета.");
        System.out.println("Ввод 2 = позволяет положить деньги на счет.");
        System.out.println("Ввод 3 = выходит из учетной записи.");
        String operation = in.nextLine();

        switch (operation) {
            case "1" : {
                System.out.println(withdraw(100));
                break;
            }
            case "2" : {
                System.out.println("Пищевые отходы выкидываются в коричневый бак.");
                break;
            }
            case "бумага" : {
                System.out.println("Бумага выкидывается в зеленый бак.");
                break;
            }
            case "прочие отходы" : {
                System.out.println("Прочие отходы выкидываются в черный бак.");
                break;
            }
            default: {
                System.out.println("Неверный ввод.");
            }
        }
    }

    // геттеры и сеттеры

    public long getAccount() {return account;}
    public void setAccount(long account) {this.account = account;}
    public String getOwner() {return owner;}
    public void setOwner(String owner) {this.owner = owner;}
    public String getBank() {return bank;}
    public void setBank(String bank) {this.bank = bank;}
    public int getBranch() {return branch;}
    public void setBranch(int branch) {this.branch = branch;}
    public double getBalance() {return balance;}
    public void setBalance(double balance) {this.balance = balance;}

    public void display () {
        System.out.println("Acc: "+ account + ", owner: " + owner + ", bank: " + bank + ", branch: "+branch+", balance: "+balance);
    }
}
