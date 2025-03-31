package Method;

import java.util.Arrays;

public class Method_33 {
    public static int[] filterEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 == 0) {
                count ++;
            }
        }
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index ++;
            }
        }

        return result;
    }
    
    public static void main(String[]args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(filterEven(numbers)));
    }
}
