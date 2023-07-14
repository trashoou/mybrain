package homework.stock.model;

public class Computer {
    private String brand;
    private String cpu;
    private int ssd;
    private int ram;
    private String gpu;
    public static final int EAN_LENGTH = 10;
    public long eanNumber;

    public Computer(String brand, String cpu, int ssd, int ram, String gpu, long eanNumber) {
        this.brand = brand;
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.gpu = gpu;
        this.eanNumber = checkEanNumber(eanNumber);
    }

    private long checkEanNumber (long eanNumber) {
        if (countDigits(eanNumber) == EAN_LENGTH) { // проверка, что 13 цифр у isbn
            return eanNumber;
        }
        return -1;
    }

    private int countDigits (long eanNumber) {
        int count = 0;
        while (eanNumber != 0) {
            count++; // счетчик кол-ва цифр
            eanNumber = eanNumber/10; // делим число на 10
        }
        return count;
    }

    @Override
    public String toString() {
        return "Computer {" +
                "brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ssd=" + ssd +
                ", ram=" + ram +
                ", gpu='" + gpu + '\'' +
                ", eanNumber=" + eanNumber +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public long getEanNumber() {
        return eanNumber;
    }

    public void setEanNumber(long eanNumber) {
        this.eanNumber = eanNumber;
    }
}
