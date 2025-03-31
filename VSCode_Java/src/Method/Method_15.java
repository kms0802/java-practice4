package Method;

public class Method_15 {
    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[]args){
        System.out.println("최댓값: " + maxOfThree(12, 55, 38));
    }
}
