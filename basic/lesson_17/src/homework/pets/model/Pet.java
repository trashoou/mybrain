package homework.pets.model;

public class Pet {
    public String pet_type;
    public double pet_weight;
    public String living_conditions;

    public Pet(String pet_type, double pet_weight, String living_conditions) {
        this.pet_type = pet_type;
        this.pet_weight = pet_weight;
        this.living_conditions = living_conditions;
    }

    public void eat () {
        System.out.println("The "+pet_type+" is eating.");
    }
    public void sleep () {
        System.out.println("The "+pet_type+" is sleeping.");
    }
    public void display () {
        System.out.println("Pet type: "+pet_type);
        System.out.println("Pet weight: "+pet_weight);
        System.out.println("Living conditions: "+living_conditions);
        System.out.println();
    }
}

