package Method;

public class Method_8 {
    public static int abs(int num) {
        if (num >= 0) {
            return num;
        } else {
            return - num;
        }
    }

    public static void main(String[]args){
        System.out.println(abs(5));
        System.out.println(abs(-3));
    }
}
