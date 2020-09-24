package de.telran.data;

public class Pet extends Animal{
    private String nickName;
    private String nameOfOwner;

    public Pet(String type, String color, String nickName, String nameOfOwner) {
        super(type, color);
        this.nickName = nickName;
        this.nameOfOwner = nameOfOwner;
    }

    public String getNickName() {
        return nickName;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void play(){
        System.out.println(nickName + "plays");
    }

    public void voice(){
        System.out.println(nickName + " says: ");
    }

    @Override
    public String toString() {
        return super.toString() + "Pet: " +  nickName +
                ", nameOfOwner: " + nameOfOwner;
    }

    public static void displayVoice(Pet pet){
        pet.voice();
    }
}
