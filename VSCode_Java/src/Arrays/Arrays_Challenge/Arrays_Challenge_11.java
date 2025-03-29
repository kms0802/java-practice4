package Arrays.Arrays_Challenge;

import java.util.Arrays;

public class Arrays_Challenge_11 {
    public static void main(String[]args){
        int[] numbers = {12, 35, 40, 27, 50, 61};
        
        int notevensCount = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                notevensCount ++;
            }
        }

        int[] notevens = new int[notevensCount];
        int index = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                notevens[index] = numbers[i];
                index ++;        
            }
        }
    System.out.println(Arrays.toString(notevens));
    }
}
