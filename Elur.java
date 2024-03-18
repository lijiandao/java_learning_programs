import animals.Dog;
import people.Person;
import people.Veterinarian;

public class Elur {
    public static void main(String[] args) {
        // 创建一个人类对象
        Person person = new Person("Alice");
        person.introduce();

        // 创建一个狗类对象
        Dog dog = new Dog("Buddy");
        dog.bark();

        // 创建一个兽医类对象，并让他检查狗
        Veterinarian vet = new Veterinarian("Dr. Smith");
        vet.checkDog(dog);
    }
}
