package de.telran.data;

public class Dog extends Pet {

    public Dog(String type, String color, String nickName, String nameOfOwner) {
        super(type, color, nickName, nameOfOwner);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("gav-gav");
    }

    public void bark(){
        System.out.println("I can bark");
    }

    @Override
    public void eat() {
        System.out.println("I can eat dogs food");
    }

    public void displayInfo(String color){
        super.type = "dog";
        System.out.println("I am a " + type);
        super.setColor(color);
        System.out.println("My color is " + super.getColor());
    }

}
