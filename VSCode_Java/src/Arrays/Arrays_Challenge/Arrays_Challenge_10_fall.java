package Arrays.Arrays_Challenge;

import java.util.Arrays;

public class Arrays_Challenge_10_fall {
    public static void main(String[]args){
        int[] numbers = {12, 35, 40, 27, 50, 61};
        
        int evensCount = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                evensCount ++;
            }
        }

        int evens[] = new int[evensCount];
        
        int index = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                evens[index] = numbers[i];
                index ++;
            }
        }

        System.out.println("짝수만 저장한 배열 : " + Arrays.toString(evens));
        
        
    
    }
}
