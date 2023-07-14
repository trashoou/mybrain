package homework.stock.model;

public class ComputerStock {
    private Computer[] computers;
    private int size;
    public ComputerStock (int capacity)  {
        computers = new Computer[capacity];
    }

    public boolean addComputer(Computer computer) {
        if ((size == computers.length) || findComputerNumber(computer.getEanNumber()) != null) {
            return false;
        }
        computers[size] = computer;
        size++;
        return true;
    }

    public Computer removeComputer(long eanNumber, Computer[] computers ){
        Computer victim = null;
        for (int i = 0; i < size; i++) {
            if(computers[i].getEanNumber() == eanNumber){
                victim = computers[i];
                computers[i] = computers[size - 1]; // на место удаляемой ставим последнюю книжку
                computers[size - 1] = null; // последнюю книгу стираем, тк она теперь стоит на месте удаленной
                size--;
                break;
            }
        }
        return victim;
    }

    public Computer findComputerNumber (long eanNumber) {
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if (eanNumber == computers[i].getEanNumber()) {
                return computers[i]; // возвращаем элемент массива типа Book
            }
        }
        return null;
    }

//    public Computer[] findComputerName (String name, Computer[] computers) {
//        //count how many books of author
//        int count = 0;
//        for (int i = 0; i < computers.length; i++) { // пробегаем по массиву
//            if (name.equals(computers[i].getBrand())) {
//                count++;
//            }
//        }
//        //заполним массив с результатами поиска
//        Computer[] computers1 = new Computer[count];
//        count = 0;
//        for (int i = 0; i < computers.length; i++) {
//            if (computers[i] != null && name.equals(computers[i].getBrand())) {
//                computers1[count] = computers[i];
//                count++;
//            }
//        }
//        return computers1;
//    }

    public Computer findComputerByName(String name) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getBrand().equalsIgnoreCase(name)) {
                return computers[i];
            }
        }
        return null;
    }

    public void listOfStockRoom () {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
