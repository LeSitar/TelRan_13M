package de.telran.data;

public class Cat extends Pet {

    public Cat(String type, String color, String nickName, String nameOfOwner) {
        super(type, color, nickName, nameOfOwner);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("myau-myau");
    }
}
