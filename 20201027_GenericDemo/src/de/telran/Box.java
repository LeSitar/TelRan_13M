package de.telran;

import de.telran.robot.BigHead;
import de.telran.robot.Head;
import de.telran.robot.Robot;
import de.telran.robot.SmallHead;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }


    public <S extends Head> void run (S head){
        System.out.println("T: " + t.getClass().getSimpleName());
        System.out.println("Head: " + head.getClass().getSimpleName());
        System.out.println(head.toString());
    }

    //public void run1(Robot<?> robot){}

    public void run1(Robot<?> robot){
        robot.getHead().getClass().getSimpleName();
    }

    public static void main(String[] args) {

        //List<? extends Number> list;
       // List<? super Integer> list2;

        List<Number> list = new ArrayList<>();
        List<String > list1 = new ArrayList<>();
        print(list);
        print2(list);

        Box<String> box = new Box<>();
        box.setT("hello");
        box.run(new SmallHead());

        Box<Integer> box2 = new Box<>();
        box2.setT(10);
        box2.run(new BigHead());
    }

    public static void print(List<? extends Number> list1){
        System.out.println(list1);
    }

    public static void print2(List<? super Integer> list2){
        System.out.println(list2);
    }
}
