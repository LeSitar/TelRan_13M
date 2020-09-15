package de.telran.application;

import de.telran.data.Address;
import de.telran.data.Person;

import java.util.Arrays;

public class PersonApp {

    public static void main(String[] args) {

        Address address1 = new Address("Berlin", "Kudamm", 24);
        Person person1 = new Person("Vasya", 2, address1);
        person1.setName("Vasiliy");
        Person person2 = new Person("Alex", 24, new Address("London", "Becker", 15 ));
        Person person3 = new Person ("Katya", 21, new Address("Moscow", "Puschkinskaya", 16));
        Person person4 = new Person ("Masha", 23, address1);

        Person person5 = new Person ("Alex", 28, new Address("Paris", "MonMarteu", 6));

        Address address2 = person2.getAddress();


        Person[] group = {person1,person2,person3,person4, person5};

        //Person.displayPersons(group);
        Person.sortPersonByAge(group);
        Person.displayPersons(group);
        System.out.println();
        //Person.sortPersonByAge2(group);
        //Person.displayPersons(group);

       /* String str1 = "Kolya";
        String str2 = "Vasya";

        System.out.println(str1.compareTo(str2));*/
        System.out.println();
      // Person.sortPersonByName(group);
      // Person.displayPersons(group);

       //Person foundPersona = Person.findPersonByAddress(group, address1);
        System.out.println(Person.findPersonByAddress(group, new Address("Belin", "Kudamm",7)));


        //System.out.println(Arrays.toString(group));
    }


}
