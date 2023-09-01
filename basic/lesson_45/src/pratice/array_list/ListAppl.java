package pratice.array_list;

public class ListAppl {
    public static void main(String[] args) {

        MyArrayList<Double> list = new MyArrayList<>();
        System.out.println(list.size());
        list.add(25.0);
        list.add(35.0);
        list.add(45.0);
        list.add(55.0);
        list.add(65.0);
        System.out.println(list.size()); // 5
        System.out.println(list);
        System.out.println(list.isEmpty()); // false
        System.out.println(list.contains(55.0)); // true
        System.out.println(list.contains(54.0)); // false
        System.out.println(list.remove(55.0)); // true
        System.out.println(list); // 55.0 removed ; size = 4
        list.add(1,80.0);
        list.add(80.0);
        System.out.println(list); // 80.0 added to second position ; size = 6
        System.out.println(list.get(1)); // 80.0
        System.out.println(list.indexOf(80.0)); // index = 1;
        System.out.println(list.lastIndexOf(80.0)); // index = 5;
        System.out.println(list.remove(5)); // last 80.0 will be removed.
        System.out.println(list);
        System.out.println(list.set(0,999.0));
        System.out.println(list); // on first pos now = 999.0;
        list.clear();
        System.out.println(list); // list is empty









/*
        MyArrayList<Integer> list = new MyArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(20);
        list.add(70);
        list.add(30);
        list.add(50);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(null);
        list.add(70);
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list.indexOf(30));
        System.out.println(list.indexOf(80));
        System.out.println(list.indexOf(50));
        System.out.println(list.indexOf(55));

        IList<String> myCityList = new MyArrayList<>();
        myCityList.add("Tashkent");
        myCityList.add("Derbent");
        myCityList.add("Sverdlovsk");
        myCityList.add("Budapest");
        myCityList.add("Kiev");

        System.out.println(myCityList.get(3));
        //System.out.println(myCityList.get(-100));
        System.out.println(myCityList.contains("Kiev"));
        System.out.println(myCityList.contains("New York"));

        myCityList.remove("Kiev");
        System.out.println(myCityList);

 */





    }
}
