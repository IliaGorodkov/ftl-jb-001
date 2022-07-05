import tasks.task001.task001;
import tasks.task002.task002;
import tasks.task003.task003;
import tasks.task004.task004;
import tasks.task005.tasks005;
import tasks.task006.tasks006;
import tasks.task007.tasks007;
import tasks.task008.tasks008;
import tasks.task009.tasks009;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        HelloWorld.run();
//        POJO.run();
//
//        Cat catVar = new Cat();
//        catVar.voice();
//
//        L004.Cat catL004 = new L004.Cat();
//        catL004.voice();

//    Cat cat = new Cat("Barsik",new Animal.AnimalWeight(20, Animal.AnimalWeight.WeightType.KG));
//    System.out.println(cat.jumpHeight());
//    cat.voice();
//
//    Dog dog = new Dog();
//    dog.goToStick(14);
//    dog.whereTheDog();
//
//    dog.goToStick(20);
//    dog.whereTheDog();
//
//    dog.goToStick(5);
//    dog.whereTheDog();
//
//    dog.voice();
//
//    Dog homelessDog = Dog.ofHomeless(new Animal.AnimalWeight(100, Animal.AnimalWeight.WeightType.KG));
//    homelessDog.voice();
//
//    Duck duck = new Duck();
//    duck.voice();
//
//    duck.takeOff();
//    duck.isTheBirdFlying();
//
//    duck.showSpeed();
//
//    duck.landing();
//    duck.isTheBirdFlying();
//    duck.showSpeed();
//
//    List<Dog> dogs = Dog.randomArray();
//    for (int i = 0; i < dogs.size(); i++){
//        System.out.println(dogs.get(i));
//    }
//
//
//    List<Dog> dogHomeless = Arrays.asList(new Dog[]{
//            Dog.ofHomeless(new Animal.AnimalWeight(2, Animal.AnimalWeight.WeightType.KG)),
//            Dog.ofHomeless(new Animal.AnimalWeight(3, Animal.AnimalWeight.WeightType.KG)),
//            Dog.ofHomeless(new Animal.AnimalWeight(5, Animal.AnimalWeight.WeightType.KG))
//    });
//    System.out.println(dogHomeless.size());
//    for (Dog dogItem : dogHomeless){
//        System.out.println(dogItem);
//        dogItem.setName(String.valueOf((new Random()).nextLong()));
//        System.out.println(dogItem.getName());
//    }
//
//    List<Dog> dogsLinkedList = new LinkedList<>();
//    dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
//    dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
//    dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
//    dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
//    dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
//
//    int indexLinkedList = 0;
//    while (indexLinkedList < dogsLinkedList.size()) {
//        System.out.println(dogsLinkedList.get(indexLinkedList));
//        indexLinkedList++;
//    }
//
//    for (int i = 0; i < 100; i++){
//        // SwitchExample.run();
//    }
//
//        System.out.println(duck.getMoveType());
//        System.out.println(dog.getMoveType().getValue());
//
//        if (dog.getMoveType() == MoveType.WALK){
//            System.out.println("Может Ходить");
//        }
//
//        StringExample.run();
//
//        TypeConversion.run();
//
//        dog.setWeight(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG));
//        try {
//            dog.getWeight().setValue(-10);
//        }catch (Animal.WeightException ignore){
//        }
//
//        FileExample.run();
//        ThreadExample.run();
//
//        House house = new House.Builder()
//                .optHasSwimmingPool(true)
//                .build();
//        System.out.println(house.toString());
//
//        house.toString();
//
//        House houseFull = new House.Builder()
//                .optHasFancyStatues(true)
//                .optHasGarage(true)
//                .optHasGarage(true)
//                .optHasSwimmingPool(true)
//                .build();
//
//        System.out.println(houseFull.toString());*/



        /*Самостоятельные Задания*/

//        task001.run();
//        task002.run();
//
//        /*задание 3 - передаем массив с данными в таблицу и после выводим в консоль содержимое массива*/
//        String[] multiplicationTable = {
//                "3*1=3"
//                , "3*2=6"
//                , "3*3=9"
//                , "3*4=12"
//                , "3*5=15"
//                , "3*6=18"
//                , "3*7=21"
//                ,"3*8=24"
//                , "3*9=27"
//                , "3*10=30"
//        };
//        task003.run(multiplicationTable);
//        /*задание 3 - конец */
//
//        task004.run(args);

//        tasks005.run();
//        tasks006.run();
//        tasks007.run();
//        tasks008.run();
        tasks009.run(args);








    }





}