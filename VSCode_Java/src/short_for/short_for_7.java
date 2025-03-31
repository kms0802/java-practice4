package short_for;

public class short_for_7 {
    public static void main(String[]args){
        int[] nums = {4, 7, 10, 13, 16};

        for (int n : nums) {
            if (n % 2 != 0) {
                System.out.println("홀수 " + n);
            }
        }
    }
}
