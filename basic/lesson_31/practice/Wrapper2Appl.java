package practice;

public class Wrapper2Appl {
    public static void main(String[] args) {

        JsonWrapper2<Long> wrapper2 = new JsonWrapper2<>(10L);
        System.out.println(wrapper2);

        Long a = wrapper2.getValue();
        System.out.println(a);

        wrapper2.genericDisplay(1);
        wrapper2.genericDisplay(1.0);
        wrapper2.genericDisplay(10L);
        wrapper2.genericDisplay("10L");

    }
}
