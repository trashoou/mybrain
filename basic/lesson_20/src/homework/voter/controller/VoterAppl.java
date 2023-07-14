package homework.voter.controller;
import homework.voter.model.Voter;
import java.util.Scanner;
public class VoterAppl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Voter voter1 = new Voter();
        System.out.println("Введите имя:");
        voter1.setFirstName(in.next());
        System.out.println("Введите фамилию:");
        voter1.setLastName(in.next());
        System.out.println("Введите возраст:");
        voter1.setAge(in.nextInt());
        if (voter1.getAge() < 18) {
            System.out.println("Допустимый возраст 18+");
        } else System.out.println("Добро пожаловать на выборы!");
        System.out.println(voter1.toString());
    }
}
