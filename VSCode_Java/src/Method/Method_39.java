package Method;

public class Method_39 {
    public static int countPassed(int[] scores) {
        int count = 0;
        for (int s : scores) {
            if (s >= 60) count ++;
        }
        return count;
    }

    public static void main(String[]args){
        int[] scores = {55, 80, 70, 40, 95};
        System.out.println(countPassed(scores));
    }
}
