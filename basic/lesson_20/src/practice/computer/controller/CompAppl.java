package practice.computer.controller;
import practice.computer.model.Computer;
import java.util.Scanner;
public class CompAppl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Computer comp1 = new Computer();
        comp1.setCpu("Intel");
        comp1.setRam(-16);
        comp1.setSsd(0);
        comp1.setBrand("govno");
        comp1.computerTurnOn();
        System.out.println(comp1.toString());

        comp1.computerTurnOn();
        comp1.computerTurnOff();
    }
}
