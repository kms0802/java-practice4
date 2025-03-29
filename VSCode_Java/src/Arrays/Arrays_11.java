package Arrays;

public class Arrays_11 {
    public static void main(String[]args){
        int[] numbers = {3, 6, 9, 12, 15};

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                System.out.println("홀수 " + numbers[i]);
            }
        }
    }
}
