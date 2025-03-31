package Method;

public class Method_10 {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[]args){
        if (isEven(10)) {
            System.out.println("짝수입니다. ");
        }
    }
}
