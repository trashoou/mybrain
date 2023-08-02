package practice.cats;

import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;
    private String color;
    private double weight;

    public Cat(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" + "name = '" + name + "', age = " + age + ", color = '" + color + "', weight = " + weight + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, weight);
    }

    @Override
    public int compareTo(Cat o) {
        // по имени и по возрасту
        int res1 = this.name.compareTo(o.name);
        int res2 = this.age - o.age;


        return res1*res2;
    }

//    @Override
//    public int compareTo(Cat o) {
//        return this.name.compareTo(o.name);
//    }

//    @Override
//    public int compareTo(Cat o) {
//        // сортируем по возрасту
//        return this.age - o.age; // сравнение по возрасту, если резульбтат отрицательный, то порядок останется,
//        // а если положительный, то обьекты поменяются местами
//    }
}
