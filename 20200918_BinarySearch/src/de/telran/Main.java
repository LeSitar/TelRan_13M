package de.telran;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,5,6,8,9,12,15,23,32,35};
        int res = binarySearch(numbers,12);
        System.out.println(res>=0? "index of 12 is " + res: "no such number in array");

    }

    private static int binarySearch(int[] numbers, int number){
        int left, right, middle;
        for (left = 0, right = numbers.length-1; left<=right;) {  // for (int a=0, b=10; a<b; a++) {System.out.println(a);}
            middle = (left+right)/2;
            if(numbers[middle]==number){
                return middle;
            }else if(numbers[middle]>number){
                right = middle-1;
            }else{
                left = middle +1;
            }
        }
        return -1;
    }
}
