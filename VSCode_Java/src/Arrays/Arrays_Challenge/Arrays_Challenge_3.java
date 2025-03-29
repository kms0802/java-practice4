package Arrays.Arrays_Challenge;

public class Arrays_Challenge_3 {
    public static void main(String[]args){
        int[] nums = {11, 22, 33, 44, 55, 66};
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                System.out.println("짝수 :" + nums[i]);
            }
        }
    }
    
}
