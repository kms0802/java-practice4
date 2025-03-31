package Method;

public class Method_29 {
    public static String evenOrOdd(int num) {
        return (num % 2 == 0) ? "짝수" : "홀수";
    }

    public static void main(String[]args){
        System.out.println(evenOrOdd(5));
    }
}
