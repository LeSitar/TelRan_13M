package de.telran;

public class LazySingleton {
    private static LazySingleton lazySingleton;
    private String name;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(String name){
        if(lazySingleton ==null) {
            lazySingleton = new LazySingleton();
            lazySingleton.name = name;
        }
        return lazySingleton;
    }

    public String getName() {
        return name;
    }
}
