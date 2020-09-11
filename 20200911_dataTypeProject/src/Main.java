import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a1 = 50;
        int a2 = 50;

        Integer b1 = 128;
        Integer b2 = 128;

        String str1 = "Vasya";
        String str2 = "Vasya";
        System.out.println(str1==str2);

        str1 = str1 + ", hello!";
        System.out.println(str1);

        System.out.println(a1==a2);
        System.out.println(b1==b2);
        System.out.println(str1==str2);

        System.out.println(str1.contains("Vasya"));


        int[] numbers = {1,2,3,4};

        System.out.println(changeNumber(a1));
        System.out.println(a1);

        changeArraysNumber(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(changeArraysNumber(numbers)));

        int[] numbers2=changeArraysNumber(numbers);
        System.out.println(Arrays.toString(numbers2));


       // int[] numbers2 =changeArraysNumber(numbers);

    }

    private static int changeNumber(int num){
        return num*2;
    }

    private static int[] changeArraysNumber(int[] numbers){
        int[] arrayOutput = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arrayOutput[i] = numbers[i]*2;
        }
        return arrayOutput;
    }

    private static void changeArrays(int[] numbers){
        for (int num:numbers) {
            num = num*2;
        }
    }



}
