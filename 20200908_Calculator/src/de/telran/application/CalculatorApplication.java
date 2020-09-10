package de.telran.application;

import de.telran.data.Calculator;
import de.telran.data.UserInteraction;

import java.util.Scanner;

import static de.telran.data.UserInteraction.getParameter;

public class CalculatorApplication {
    public static void main(String[] args) {

        double a = getParameter();
        double b = getParameter();
        char operation = UserInteraction.operation();
        Calculator.calculation(a,b,operation);
        UserInteraction.closeScanner();

        /* using nextLine() method after nextInt()

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();
        System.out.println("enter your name");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Hallo " + name + "! you are " + age + " years old");
        scanner.close();*/

    }
}
