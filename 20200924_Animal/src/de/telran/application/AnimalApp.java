package de.telran.application;

import de.telran.data.Animal;
import de.telran.data.Cat;
import de.telran.data.Dog;
import de.telran.data.Pet;

public class AnimalApp {
    public static void main(String[] args) {

        Object animal1 = new Animal("Bear", "brown");
        Object dog = new Dog("Dog", "black","Bobik", "Olya");

        Dog dog1 = new Dog("Dog", "white", "Sharfik", "Kolya");


        ((Animal)animal1).eat();
        System.out.println();


        Pet cat = new Cat("Cat", "white", "murzik", "Vasya");
        Pet dog2 = new Dog("Dog", "braun", "Tuzik", "Katya");
        /*cat.voice();
        dog2.voice();*/

        Pet.displayVoice(cat);
        Pet.displayVoice(dog2);



/*
        dog1.displayInfo("black");
        System.out.println(dog1);
        System.out.println(dog2);*/

        //System.out.println(animal1 instanceof Dog);



       /* dog1.eat();
        dog1.sleep();
        dog1.bark();

        System.out.println();

        dog2.eat();
        System.out.println();
        */



       // ((Dog)dog2).bark();

        //dog1.displayInfo("black");





    }
}
