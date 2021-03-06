package de.telran.data;

public class Dog {

    private String name;
    private int age;
    private String breed;
    private double weight;
    private String nameOwner;
    private boolean dogStatus;




    public Dog(){}

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, String breed, double weight, String nameOwner) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        this.nameOwner = nameOwner;
    }

    public void dogSleep(){
        this.dogStatus = true;
        dogSleep1();
    }

    public void dogRun(){
        this.dogStatus = false;
    }

    public void dogSleep1(){
        System.out.println("i'm sleeping");
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
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public boolean isDogStatus() {
        return dogStatus;
    }

    public void setDogStatus(boolean dogStatus) {
        this.dogStatus = dogStatus;
    }

    // a>b ? true:false


    public void display(){
        System.out.println("Nickname: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age " + age);
        System.out.print(name + ": " + (dogStatus ? "hr-hr-hr":"gav-gav-gav"));
        /*if(dogStatus)
            System.out.println("hr-hr-hr");
        else{
            System.out.println("gav-gav-gav");
        }*/
    }

    @Override
    public String toString() {
        return "Dog: " +
                name  +
                ", age: " + age;
    }

    public void dogVoice(){
        System.out.println("gav-gav-gav");
    }

    public static void someMethod(){
        System.out.println("hello!");
    }
}
