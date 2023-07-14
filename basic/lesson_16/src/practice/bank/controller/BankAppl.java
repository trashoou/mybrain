package practice.bank.controller;

import practice.bank.model.BankAccount;
public class BankAppl {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1,"Dmitriy Khramov","Volksbank", 999,100);
        // acc1 - объектная переменная, в которой собраны все поля класса и их значения
        System.out.println(acc1.getAccount());
        System.out.println(acc1.getOwner());
        System.out.println(acc1.getBank());
        System.out.println(acc1.getBranch());
        System.out.println(acc1.getBalance());
        acc1.deposit(500);
        acc1.display();
        acc1.withdraw(700);
        acc1.display();
        // внести деньги на депозит

        BankAccount acc2 = new BankAccount(2, "Michael","Volksbank",101);
        acc2.display();
        BankAccount acc3 = new BankAccount(3, "Artem","Volksbank",101);
        acc3.display();
        BankAccount acc4 = new BankAccount(4,"Volksbank",101,100);
        acc4.display();
    }
}
