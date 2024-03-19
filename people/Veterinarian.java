package people;

import animals.Dog;

public class Veterinarian {
    public String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public void checkDog(Dog dog) {
        System.out.println("Veterinarian " + name + " is checking " + dog.name);
        dog.bark();
    }
}