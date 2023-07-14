package practice.computer.controller;
import practice.computer.model.Computer;
import practice.computer.model.Laptop;
public class CompAppl {
    public static void main(String[] args) {
        Computer pc1 = new Computer("i5", 16, 512,"HP");
        pc1.display();
        Computer pc2 = new Computer("i5", 16, 512,"Asus");
        pc2.display();

        Laptop l1 = new Laptop("i7", 32, 1024,"Acer", 13,2);
        l1.display();
    }
}
