package de.telran.data;

public class WaitState implements GadgetState{
    @Override
    public void doAction() {
        System.out.println("i'm waiting");
    }
}
