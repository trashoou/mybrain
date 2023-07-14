package practice.nod;

public class NodArgumentAppl {
    public static void main(String[] args) { // в качестве аргумента передаем
        int n = args.length;

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        Nod nod;
        nod = new Nod();

        System.out.println(nod.nod(a,b));
    }
}
