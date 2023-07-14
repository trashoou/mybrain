package homework.stock.controller;

import homework.stock.model.ComputerStock;
import homework.stock.model.Computer;

import java.util.Scanner;

import static java.lang.System.exit;

public class ComputerAppl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ComputerStock computerStock = new ComputerStock(1000);

        computerStock.addComputer(new Computer("GIGABYTE","Intel i9",1000,16,"Nvidia GeForce RTX 3070 ",9999999991L));
        computerStock.addComputer(new Computer("ASUS","Intel i7",500,32,"Nvidia GeForce RTX 3060 ",9999999992L));

        while (true) {
            System.out.println("1 - list of stockroom");
            System.out.println("2 - add computer");
            System.out.println("3 - remove computer");
            System.out.println("4 - findComputerEanNumber");
            System.out.println("5 - findComputerName");
            System.out.println("6 - end");

            int operation = in.nextInt();
            in.nextLine();

            switch (operation) {
                case 1: {
                    computerStock.listOfStockRoom();
                    break;
                }
                case 2: {
                    System.out.println("Input brand of pc: ");
                    String brand = in.nextLine();
                    System.out.println("Input CPU of pc: ");
                    String cpu = in.nextLine();
                    System.out.println("Input size ssd of pc: ");
                    int ssd = in.nextInt();
                    System.out.println("Input size ram of pc: ");
                    int ram = in.nextInt();
                    in.nextLine();
                    System.out.println("Input name of graphic card for pc: ");
                    String gpu = in.nextLine();
                    System.out.println("Create eanNumber for pc: ");
                    long eanNumber = in.nextLong();
                    computerStock.addComputer(new Computer(brand, cpu, ssd, ram, gpu, eanNumber));
                    break;
                }
                case 3: {
                    System.out.println("Input eanNumber of pc:");
                    long eanNumber = in.nextLong();
                    computerStock.removeComputer(eanNumber, computerStock.getComputers());
                    break;
                }
                case 4: {
                    System.out.println("Input ean-number of pc: ");
                    long eanNumber = in.nextLong();
                    System.out.println(computerStock.findComputerNumber(eanNumber));
                    break;
                }
                case 5: {
                    System.out.println("Input name of pc: ");
                    String name = in.next();
                    System.out.println(computerStock.findComputerByName(name));
                    break;
                }
                case 6: {
                    exit(0);
                    break;
                }
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}
