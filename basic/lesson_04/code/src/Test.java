public class Test {

    public static void main(String[] args) {
        //a*x^2 + b*x + c = 0
        double a, b, c;
        double x1, x2;

        a = 0;
        b = 1;
        c = 1;

        double Discrimenant = b*b - 4 * a * c;

        if (Discrimenant == 0) {
            x1 = (-b)/(2 * a);
            System.out.printf("x1 = x2 = %s", x1);

        }
        else if(Discrimenant > 0) {
            x1 = (-b + Math.sqrt(Discrimenant))/(2 * a);
            x2 = (-b - Math.sqrt(Discrimenant))/(2 * a);
            System.out.printf("x1 = %s, x2 = &#176", x1, x2);
        }
        else
        {
            System.out.println("Нет целого решения так как дискреминант < 0");
        }



    }
}
