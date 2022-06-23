import animals.Cat;
import animals.Dog;
import animals.Duck;

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

    Dog[] dogHomeless = new Dog[]{
            Dog.ofHomeless(2),
            Dog.ofHomeless(3),
            Dog.ofHomeless(5)
    };
    System.out.println(dogHomeless.length);
    System.out.println(dogHomeless[0]);
    System.out.println(dogHomeless[1]);
    System.out.println(dogHomeless[2]);

    Dog[] dogs = Dog.randomArray();
    System.out.println(dogs[0]);
    System.out.println(dogs[1]);
    System.out.println(dogs[2]);

    }
}