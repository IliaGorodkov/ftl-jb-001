import L013.SwitchExample;
import L019.StringExample;
import L020.TypeConversion;
import animals.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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

    Cat cat = new Cat("Barsik",new Animal.AnimalWeight(20, Animal.AnimalWeight.WeightType.KG));
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

    Dog homelessDog = Dog.ofHomeless(new Animal.AnimalWeight(100, Animal.AnimalWeight.WeightType.KG));
    homelessDog.voice();

    Duck duck = new Duck();
    duck.voice();

    duck.takeOff();
    duck.isTheBirdFlying();

    duck.showSpeed();

    duck.landing();
    duck.isTheBirdFlying();
    duck.showSpeed();

    List<Dog> dogs = Dog.randomArray();
    for (int i = 0; i < dogs.size(); i++){
        System.out.println(dogs.get(i));
    }


    List<Dog> dogHomeless = Arrays.asList(new Dog[]{
            Dog.ofHomeless(new Animal.AnimalWeight(2, Animal.AnimalWeight.WeightType.KG)),
            Dog.ofHomeless(new Animal.AnimalWeight(3, Animal.AnimalWeight.WeightType.KG)),
            Dog.ofHomeless(new Animal.AnimalWeight(5, Animal.AnimalWeight.WeightType.KG))
    });
    System.out.println(dogHomeless.size());
    for (Dog dogItem : dogHomeless){
        System.out.println(dogItem);
        dogItem.setName(String.valueOf((new Random()).nextLong()));
        System.out.println(dogItem.getName());
    }

    List<Dog> dogsLinkedList = new LinkedList<>();
    dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
    dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
    dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
    dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
    dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));

    int indexLinkedList = 0;
    while (indexLinkedList < dogsLinkedList.size()) {
        System.out.println(dogsLinkedList.get(indexLinkedList));
        indexLinkedList++;
    }

    for (int i = 0; i < 100; i++){
        // SwitchExample.run();
    }

        System.out.println(duck.getMoveType());
        System.out.println(dog.getMoveType().getValue());

        if (dog.getMoveType() == MoveType.WALK){
            System.out.println("?????????? ????????????");
        }

        StringExample.run();

        TypeConversion.run();





    }
}