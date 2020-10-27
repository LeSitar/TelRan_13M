package de.telran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>(Arrays.asList(5,7,8,1,3,4));
        System.out.println(listNumbers);
        Collections.sort(listNumbers);
        System.out.println(listNumbers);


        Person p1 = new Person("Anna", 30);
        Person p2 = new Person("Kolya", 18);

        List<Person> persons = new ArrayList<>(Arrays.asList(p1,p2, new Person("Vasya", 27), new Person("Anna", 24)));

        /*Collections.sort(persons);
        System.out.println(persons);*/

        persons.sort(new PersonComparatorByAge());
        System.out.println(persons);

        Collections.sort(persons, new PersonComparatorByNameAndAge());
        System.out.println(persons);


    }
}
