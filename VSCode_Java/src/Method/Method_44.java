package Method;

import java.util.Arrays;

public class Method_44 {
    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
    public static void main(String[]args){
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(reverseArray(nums)));
    }
}
