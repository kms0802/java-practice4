package Arrays.Arrays_Challenge;

public class Arrays_Challenge_2 {
    public static void main(String[]args){
        int[] nums = {23, 45, 12, 78, 56};
        int max = nums[0];

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i]; // 오답부분
                
            }
        }

        System.out.println("최댓값: " + max);
    }

}
