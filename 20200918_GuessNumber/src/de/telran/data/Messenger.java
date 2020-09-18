package de.telran.data;

import java.util.Scanner;

public class Messenger {
    private Scanner scanner = new Scanner(System.in);

    void displayMessege(String str){
        System.out.println(str);
    }

    int getNumber(){
        return scanner.nextInt();
    }
    void closeMessenger(){
        scanner.close();
    }
}
