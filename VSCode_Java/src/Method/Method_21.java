package Method;

public class Method_21 {
    public static int fatherFromZero(int a, int b) {
        return (Math.abs(a) > Math.abs(b)) ? a : b;
    }
    public static void main(String[]args){
        System.out.println(fatherFromZero(-8, 5));
    }
}
