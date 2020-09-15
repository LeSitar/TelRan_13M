package de.telran.data;

public class Person {
    private String name;
    private int age;
    private double height;
    private Address address;



    public Person(String name, int age, Address address ){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0&&age<110)
        this.age = age;
        else
            System.out.println("wrong age");

    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        if (Double.compare(person.getHeight(), getHeight()) != 0) return false;
        if (!getName().equals(person.getName())) return false;
        return getAddress().equals(person.getAddress());

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName().hashCode();
        result = 31 * result + getAge();
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getAddress().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return  "Name: " + name +
                ", age: " + age
                + ", height: " + height + '\n' + address;
    }

    public static void displayPersons(Person[] persons){
        for (Person p :persons) {
            System.out.println(p);
        }
    }

  /*  public static int findMax(int[] numbers){ //{1,2,3,4,5}
        int max = 0;
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }*/


    public static Person getOldestPerson(Person[] persons){  //{Vasya, Petya, Olya, Masha}
        Person oldestPerson = persons[0];
        for (int i = 1; i <persons.length ; i++) {
            if(persons[i].age>oldestPerson.age){
                oldestPerson = persons[i];
            }
        }
        return oldestPerson;
    }

    public static void displayOldestPerson(Person[] persons){
    }

    // 6>9
    // p1>p2 ?

    private static int comparePersonByAge(Person p1, Person p2){
        if(p1.age>p2.age)
            return 1;
        else if(p1.age<p2.age)
                return -1;
        return 0;
    }

    private int compareToPersonByAge(Person person){
        if(this.age>person.age)
            return 1;
        else if(this.age<person.age)
            return -1;
        return 0;
    }

    public static void sortPersonByAge(Person[] persons){
        for (int i = 0; i <persons.length-1 ; i++){
            for (int j = 0; j <(persons.length-1)-i ; j++) {
                if(comparePersonByAge(persons[j], persons[j+1])<0){
                    Person temp = persons[j+1];
                    persons[j+1] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }

    public static void sortPersonByAge2(Person[] persons){
        for (int i = 0; i <persons.length-1 ; i++) {
            for (int j = 0; j <(persons.length-1) -i ; j++) {
                if(persons[j].compareToPersonByAge(persons[j+1])>0){
                    Person temp = persons[j+1];
                    persons[j+1] = persons[j];
                    persons[j] = temp;
                }
            }

        }
    }

    public static void sortPersonByName(Person[] persons){
        for (int i = 0; i <persons.length-1; i++) {
            for (int j = 0; j < (persons.length-1) -i; j++) {
                if(persons[j].name.compareTo(persons[j+1].name)>0){
                    Person temp = persons[j+1];
                    persons[j+1] = persons[j];
                    persons[j] = temp;
                }
            }

        }
    }

    public static Person findPersonByAddress(Person[] persons, Address address){
        for (Person p:persons) {
           if(address.equals(p.address)){
               return p;
           }
        }
       // System.out.println("Person not found");
        return null;
    }

    public static void displayPersonByAddress(Person[] persons, Address address){
        boolean flag=false;
        for (Person p:persons) {
            if(address.equals(p.address)){
                System.out.println(p);
                flag = true;
            }
        }
        if(!flag)
        System.out.println("Person not found");
    }

}
