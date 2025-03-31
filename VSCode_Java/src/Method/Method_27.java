package Method;

public class Method_27 {
    public static int maxInArray(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }

    public static void main(String[]args) {
        int[] nums = {10, 30, 20};

        System.out.println(maxInArray(nums));
    }
}
