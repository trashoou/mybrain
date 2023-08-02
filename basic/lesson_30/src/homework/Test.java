package homework;

import org.w3c.dom.ls.LSOutput;

class Test {
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass() + " = " + element);
    }

    public static void main(String[] args) {
        genericDisplay(11);
        genericDisplay("GeeksForGeeks");
        genericDisplay(1.0);
    }
}



