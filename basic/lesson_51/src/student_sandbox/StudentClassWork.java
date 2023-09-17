package student_sandbox;

public class StudentClassWork {
    private static Node head;
    private static Node tail;
    private int size;

    public static void main(String[] args) {
        System.out.println(Math.pow(2, 16));
        System.out.println(Math.pow(16, 2));
    }



    class Node {
        Object data;
        Node left;
        Node right;
        Node parent;
    }
// n        1       2       4       8       16      32      50      64
// O(1)     1       1
// O(logn)  0       1       2       3       4       5       5,6     6
// O(n)     1       2       4       8       16
// O(n^2)   1                               65536
// O(2^n)   2                               256
// O(n!)    1       2       24
// 50! -> 1 * 2 * 3 * 4 * 5


}
