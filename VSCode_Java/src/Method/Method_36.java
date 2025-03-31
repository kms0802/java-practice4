package Method;

public class Method_36 {
    public static boolean contains(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return true;
        }
        return false;
    }

    public static void main(String[]args){
        int[] nums = {1, 3, 5, 7};
        System.out.println(contains(nums, 5));
        System.out.println(contains(nums, 8));
    }
}
