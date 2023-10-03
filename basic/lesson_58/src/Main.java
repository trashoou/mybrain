public class Main {
    public static Integer basicMath(String op, int v1, int v2)
    {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> null;
        };
    }

    public static String oddOrEven (int[] array) {
        // your code
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        if (sum % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static int squareSum(int[] n)
    {
        int res = 0;
        for (int i : n) {
            res += i*i;
        }
        return res;
    }
}
