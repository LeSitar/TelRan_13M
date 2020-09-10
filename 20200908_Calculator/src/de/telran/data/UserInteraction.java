package de.telran.data;

import java.util.Scanner;

public class UserInteraction {

    private static Scanner scanner = new Scanner(System.in);

   public static double getParameter(){
       System.out.println("Enter number, please");
       while (!scanner.hasNextDouble()){
           System.out.println("it's not number, enter number");
           scanner.next();
           scanner.hasNextDouble();
       }
        return scanner.nextDouble();
    }

    // double a = getParameter();

    public static char operation(){
        System.out.println("Enter operation symbol, please");
        char operation = scanner.next().charAt(0);
        while (operation != '+' && operation != '-' && operation !='*' && operation != '/' ){
            System.out.println("wrong operation symbol, enter new please");
            operation = scanner.next().charAt(0);
        }
        return operation;
    }

    static double getRightDelimiter(double delimiter){           //use only in class in same package
       while (delimiter==0){
           System.out.println("Error. Enter another number");
           delimiter = scanner.nextDouble();
       }
       return delimiter;
    }

    public static void closeScanner(){
       scanner.close();
    }

}
