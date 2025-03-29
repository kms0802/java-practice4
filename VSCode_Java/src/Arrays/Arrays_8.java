package Arrays;

import java.util.Arrays;

public class Arrays_8 {
    public static void main(String[]args){
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            reversed[i] = numbers[numbers.length - 1 - i];
        }
    
    System.out.println(Arrays.toString(reversed));
    }
}
