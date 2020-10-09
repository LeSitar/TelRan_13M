package de.telran;

public class Cat extends Pet {
    static {
        System.out.println("Static block in Cat");
    }
    {
        System.out.println("first block in Cat");
    }
    {
        System.out.println("second block in Cat");
    }

    public Cat(){
        System.out.println("Cat empty constructor");
    }

    public void voice(){
        System.out.println("Myau");
    }

    static void sayHello(){
        System.out.println("Hello!");
    }
}
