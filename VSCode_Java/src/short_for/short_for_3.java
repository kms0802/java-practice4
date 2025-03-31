package short_for;

public class short_for_3 {
    public static void main(String[]args){
        int[] numbers = {3, 6, 8, 11, 20};

        for (int n : numbers) {
            if (n % 2 == 0){
                System.out.println("짝수: " + n);
            }
        }
    }
}
