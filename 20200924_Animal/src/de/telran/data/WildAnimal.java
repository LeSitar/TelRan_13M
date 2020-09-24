package de.telran.data;

public class WildAnimal extends Animal {

    private String habitat;

    public WildAnimal(String type, String color, String habitat) {
        super(type, color);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void migration(String newHabitat){
        habitat = newHabitat;
        //System.out.println(type + " is going to south");
    }

    @Override
    public void run(){
        System.out.println(type + ", i can run faster");
    }
}
