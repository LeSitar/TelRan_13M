package de.telran.application;
import de.telran.data.Dog;

public class DogApplication {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Dog dog1 = new Dog("Sharik", 3);

        /*System.out.println(dog1.getName());
        dog.setName("Bobik");
        System.out.println(dog.getName());
        dog.setName("Tuzik");
        System.out.println(dog.getName());
        System.out.println(dog);
        dog.dogVoice();
        Dog.someMethod();*/

        System.out.println(dog1.isDogStatus());
        //dog1.dogSleep();
        dog.dogSleep1();
        dog1.dogSleep();
        dog1.display();




    }

}
