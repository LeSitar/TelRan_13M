package de.telran;

public class Main {
    public static void main(String[] args) {
        //System.out.println(SingletonOne.getNAME());
        SingletonOne singletonOne = SingletonOne.getINSTANCE();

        LazySingleton lz1 = LazySingleton.getInstance("Boss");
        System.out.println(lz1.getName());

        LazySingleton lz2 = LazySingleton.getInstance("Vasya");
        System.out.println(lz2.getName());

        System.out.println(lz1==lz2);


    }
}
