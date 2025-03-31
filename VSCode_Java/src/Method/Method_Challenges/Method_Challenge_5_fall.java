package Method.Method_Challenges;

import java.util.Scanner;

public class Method_Challenge_5_fall {
    public static int maxInArray(int[] numbers){
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String[]args){
        int[] nums1 = {10, 50, 30, 70, 20};
        int[] nums2 = {3, 5, 2, 8, 9, 4};

        System.out.println("최댓값: " + maxInArray(nums1));
    }
}
