package homework.appmaxmin;

public class MinMaxValueApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            printDefaultMinMaxValues();
        } else {
            for (String arg : args) {
                printMinMaxValue(arg);
            }
        }
    }

    private static void printDefaultMinMaxValues() {
        System.out.println("Минимальные/максимальные значения по умолчанию:");

        System.out.println("byte: " + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " - " + Short.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " - " + Long.MAX_VALUE);
        System.out.println("char: " + (int) Character.MIN_VALUE + " - " + (int) Character.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " - " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " - " + Double.MAX_VALUE);
    }

    private static void printMinMaxValue(String type) {
        System.out.println("Тип: " + type);

        switch (type) {
            case "byte":
                System.out.println("Минимальное значение: " + Byte.MIN_VALUE);
                System.out.println("Максимальное значение: " + Byte.MAX_VALUE);
                break;
            case "int":
                System.out.println("Минимальное значение: " + Integer.MIN_VALUE);
                System.out.println("Максимальное значение: " + Integer.MAX_VALUE);
                break;
            case "short":
                System.out.println("Минимальное значение: " + Short.MIN_VALUE);
                System.out.println("Максимальное значение: " + Short.MAX_VALUE);
                break;
            case "long":
                System.out.println("Минимальное значение: " + Long.MIN_VALUE);
                System.out.println("Максимальное значение: " + Long.MAX_VALUE);
                break;
            case "char":
                System.out.println("Минимальное значение: " + (int) Character.MIN_VALUE);
                System.out.println("Максимальное значение: " + (int) Character.MAX_VALUE);
                break;
            case "float":
                System.out.println("Минимальное значение: " + Float.MIN_VALUE);
                System.out.println("Максимальное значение: " + Float.MAX_VALUE);
                break;
            case "double":
                System.out.println("Минимальное значение: " + Double.MIN_VALUE);
                System.out.println("Максимальное значение: " + Double.MAX_VALUE);
                break;
            default:
                System.out.println(type + " - неверный тип");
        }

        System.out.println();
    }
}
