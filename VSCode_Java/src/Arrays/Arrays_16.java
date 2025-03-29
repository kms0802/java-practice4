package Arrays;

public class Arrays_16 {
    public static void main(String[]args){
        int[] nums = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int count = 0;

        for (int n : nums){
            if (n == target){
                count++;
            }
        }

    System.out.println(target + "의 개수: " + count);
    }
}
