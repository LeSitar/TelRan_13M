public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,7};
        System.out.println(findMissedNumber(arr));
        System.out.println(findMissedNumber2(arr));
        System.out.println(findMissNumber(arr));
        System.out.println(findMissedNumber3(arr));

    }

    private static int findMissedNumber(int[] input){
        int result = 0;
        for (int i = 0; i <input.length-1 ; i++) {
            if(input[i]+1 != input[i+1]){
                result = input[i]+1;
                break;
            }
        }
        return result;
    }

    private static int findMissedNumber3(int[] input){
        int res = -1;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i + 1] - input[i] > 1) {
                res = (input[i] + input[i + 1]) / 2;
            }
        }
        return res;
    }


    private static int findMissedNumber2(int[] input){     // [0] [1] [2] [3] [5]
        int sum = 0, sumI=0;
        for (int i = 0; i <input.length ; i++) {
            sum +=input[i];
            sumI += (i+1);
        }
        return sumI-sum;
    }

    private static int findMissNumber(int[] numbers){   //  [1] [2] [4] [5][6]
        int sum =0, sumI=0;
        for (int i = 0; i <numbers.length ; i++) {
            sum+=numbers[i];
            sumI += (i+1);
        }
        sumI += numbers.length+1;
        return sumI-sum;
    }




}
