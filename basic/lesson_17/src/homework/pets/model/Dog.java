package homework.pets.model;

public class Dog extends Pet {
    public String name;
    public String breed;
    public int age;

    public Dog(String pet_type, double pet_weight, String living_conditions, String name, String breed, int age) {
        super(pet_type, pet_weight, living_conditions);
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public void run () {
        System.out.println(name + " is running.");
    }
    public void display () {
        super.display();
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years old");
        System.out.println("Living Conditions: " + living_conditions);
        System.out.println("Woof!");
        run();
        eat();
        sleep();
        System.out.println();
    }
}
