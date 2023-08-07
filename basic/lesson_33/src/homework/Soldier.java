package homework;

import java.util.Objects;
import java.util.function.Predicate;

public class Soldier {
    private String name;
    private int height;
    private double weight;
    private int profile;

    public Soldier(String name, int height, double weight, int profile) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        if (profile >= 1 && profile <= 99) {
            this.profile = profile;
        } else {
            throw new IllegalArgumentException("Profile value must be between 1 and 99.");
        }
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", profile=" + profile +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldier soldier = (Soldier) o;
        return Double.compare(soldier.height, height) == 0 && Double.compare(soldier.weight, weight) == 0 && profile == soldier.profile && Objects.equals(name, soldier.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, profile);
    }

    public static void printArray(Object[] arr) {
        for (Object element : arr) {
            System.out.println(element);
        }
        System.out.println("================");
    }

    public static Soldier findSoldierByName(Soldier[] soldiers, String name) {
        for (Soldier soldier : soldiers) {
            if (soldier.name.equals(name)) {
                return soldier;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        if (profile >= 1 && profile <= 99) {
            this.profile = profile;
        } else {
            throw new IllegalArgumentException("Profile value must be between 1 and 99.");
        }
    }

    // поиск объектов по условию
    public static  <T> T findByPredicate(T[] arr, Predicate<T> predicate) { // метод возвращает тип T, из массива типа T[], отбор по предикату
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                return arr[i];
            }
        }
        return null;
    }


}
