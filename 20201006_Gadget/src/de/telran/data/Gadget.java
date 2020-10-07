package de.telran.data;

public class Gadget {

    private GadgetState state;

    public void setState(GadgetState state) {
        this.state = state;
    }

    public void doAction(){
        this.state.doAction();
    }
    /*public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void doAction(){
        if(state.equalsIgnoreCase("on"))
            System.out.println("i'm switched ON");
        else{
            System.out.println("i'm switched OFF");
        }
    }*/


}
