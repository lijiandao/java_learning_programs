package animals;

public class Dog {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " says: Bark!");
    }
}
