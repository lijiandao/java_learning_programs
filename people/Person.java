package people;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name);
    }
}