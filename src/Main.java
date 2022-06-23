import animals.Cat;
import animals.Dog;
import animals.Duck;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        HelloWorld.run();
//        POJO.run();
//
//        Cat catVar = new Cat();
//        catVar.voice();
//
//        L004.Cat catL004 = new L004.Cat();
//        catL004.voice();

    Cat cat = new Cat("Barsik",20);
    System.out.println(cat.jumpHeight());
    cat.voice();

    Dog dog = new Dog();
    dog.goToStick(14);
    dog.whereTheDog();

    dog.goToStick(20);
    dog.whereTheDog();

    dog.goToStick(5);
    dog.whereTheDog();

    dog.voice();

    Dog homelessDog = Dog.ofHomeless(100);
    homelessDog.voice();

    Duck duck = new Duck();
    duck.voice();

    duck.takeOff();
    duck.isTheBirdFlying();

    duck.showSpeed();

    duck.landing();
    duck.isTheBirdFlying();
    duck.showSpeed();

        List<Dog> dogHomeless = Arrays.asList(new Dog[]{
            Dog.ofHomeless(2),
            Dog.ofHomeless(3),
            Dog.ofHomeless(5)
    });
    System.out.println(dogHomeless.size());
    System.out.println(dogHomeless.get(0));
    System.out.println(dogHomeless.get(1));
    System.out.println(dogHomeless.get(2));

    List<Dog> dogs = Dog.randomArray();
    System.out.println(dogs.get(0));
    System.out.println(dogs.get(1));
    System.out.println(dogs.get(2));

    }
}