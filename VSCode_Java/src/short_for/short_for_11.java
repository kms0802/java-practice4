package short_for;

public class short_for_11 {
    public static void main(String[]args) {
        int [][] matrix = {
            {1, 2, 3},
            {4, 5},
            {6}
        };

        int sum = 0;

        for (int[] row : matrix) {
            for (int num : row) {
                sum = sum + num;
            }
        }

        System.out.println("총합: " + sum);
    }
}
