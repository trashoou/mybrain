package homework.pets.controller;


import homework.pets.model.Cat;
import homework.pets.model.Dog;

public class HouseAppl {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog", 5, "Outdoors","Irma", "pit bull", 2 );
        Dog dog2 = new Dog("Dog", 10, "Indoors","Muha", "Labrador", 4 );

        Cat cat1 = new Cat("Cat",2,"Indoors","Zina","British", 1);
        Cat cat2 = new Cat("Cat",1,"Indoors","Murka","British", 3);
        Cat cat3 = new Cat("Cat",1,"Indoors","Sima","British", 2);

        dog1.display();
        dog2.display();

        cat1.display();
        cat2.display();
        cat3.display();
    }
}


