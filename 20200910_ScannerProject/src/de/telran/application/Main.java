package de.telran.application;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter size of array, please");
        int arraySize = scanner.nextInt();

        int[] myArray = new int[arraySize];
        fillArray(myArray);

        System.out.println("enter number to delete");
        int deleteNumber = scanner.nextInt();

        boolean checkNumber = isDeleteNumberInArray(myArray, deleteNumber);
        printResult(myArray, checkNumber, deleteNumber);
        scanner.close();

    }

    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter number, please");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static boolean isDeleteNumberInArray(int[] array, int number) {
        for (int num : array) {
            if (num == number)
                return true;
        }
        return false;
    }

    public static int[] getArrayWithoutDeleteNumber(int[] array, int number) {
        int count = 0;
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (number != array[i]) {
                newArray[count] = array[i];
                count++;
            }
        }
        return newArray;
    }

    public static void printResult(int[] numbers, boolean check, int number) {
        if (check) {
            System.out.println("Yes!!!");
            System.out.println(Arrays.toString(getArrayWithoutDeleteNumber(numbers, number)));
        } else {
            System.out.println("No(((");
            System.out.println("Try again");
        }
    }
}
