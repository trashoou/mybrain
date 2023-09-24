class Main {
    public static String whoLikesIt(String... names) {
        int res = names.length;
        if (names.length == 0) {
            return "no one likes this";
        } else if (names.length == 1) {
            return names[0] + " likes this";
        } else if (names.length == 2) {
            return names[0] +" and "+ names[1]+" like this";
        } else if (names.length == 3) {
            return names[0]+", "+names[1]+" and "+names[2]+" like this";
        } else {
            return names[0]+", "+names[1]+" and "+res+" others like this";
        }
    }

    public static long findNextSquare(long sq) {
        double sqrt = Math.sqrt(sq);
        System.out.println(sqrt);
        if (sqrt % 1 == 0) { // Проверяем, является ли квадратный корень целым числом
            long next = (long) sqrt + 1;
            System.out.println(next);
            long res = next * next;
            System.out.println(res);
            return res;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        findNextSquare(121);
        System.out.println(12*12);
    }
}
