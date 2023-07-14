package practice.pc.model;

import java.util.Objects;

public class Computer {
    // поля класса
    String cpu;
    int ram;
    int ssd;
    String brand;

    public Computer(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public String getCpu() {return cpu;}

    public void setCpu(String cpu) {this.cpu = cpu;}

    public int getRam() {return ram;}
    public void setRam(int ram) {this.ram = ram;}
    public int getSsd() {return ssd;}
    public void setSsd(int ssd) {this.ssd = ssd;}
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    @Override
    public String toString() {
        return "Brand: "+brand+", CPU: "+cpu+", RAM: "+ram+", SSD: "+ssd;
    }

    // метод для сравнения объектов

    @Override
    public boolean equals(Object o) { // сигнатура метода: модификатор, ТИП ВОЗВРАЩАЕМОГО МЕТОДОМ ЗНАЧЕНИЯ, имя метода
        // тип переменной и ее имя, которое принимает метод
        if (this == o) return true; // если мы сравниваем объект сам с собой
        if (o == null || getClass() != o.getClass()) return false; // если сравниваем с null или объекты из разных классов
        Computer computer = (Computer) o; // производим downcasting предложенного для сравнения объекта до класса Computer
        return ram == computer.ram && ssd == computer.ssd && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand);
        // логическое выражение
    }
}
