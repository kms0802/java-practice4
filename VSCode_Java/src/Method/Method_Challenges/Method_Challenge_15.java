package Method.Method_Challenges;

import java.util.Arrays;

public class Method_Challenge_15 {
    public static int[] filterEven(int[] arr) {
        int evenCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount ++;
            }
        }
        
        
        int index = 0;
        int[] even = new int[evenCount];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                even[index] = arr[i];
                index ++;
            }
        }

        return even;
    }

    public static void main(String[]args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] result = filterEven(numbers);
        System.out.println(Arrays.toString(result));
    }
}
