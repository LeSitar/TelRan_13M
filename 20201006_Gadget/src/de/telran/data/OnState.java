package de.telran.data;

public class OnState implements GadgetState{
    @Override
    public void doAction() {
        System.out.println("i'm switched on");
    }
}
