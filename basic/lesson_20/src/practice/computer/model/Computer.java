package practice.computer.model;

import java.util.Objects;

public class Computer {
    public String cpu;
    public int ram;
    public int ssd;
    public String brand;
    public String indicator;

    public Computer(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }
    public Computer() {
    }

    @Override
    public String toString() {
        return "Brand: "+brand+", CPU: "+cpu+", RAM: "+ram+", SSD: "+ssd+ ", indicator: "+indicator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && ssd == computer.ssd && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand);
    }

    public void computerTurnOn () {
        indicator = "On";
        System.out.println("Computer is working...");
    }
    public void computerTurnOff () {
        indicator = "Off";
        System.out.println("Computer is NOT working...");
    }


    public void display () {
        System.out.println("Brand: "+brand+" CPU: "+cpu+" RAM: "+ram+" SSD: "+ssd);
    }
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if(ram>0) {
            this.ram = ram;
        } else {
            return;
        }
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        if (ssd > 0) {
            this.ssd = ssd;
        } else {
            return;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
