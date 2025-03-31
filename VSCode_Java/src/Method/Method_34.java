package Method;

public class Method_34 {
    public static int maxAbs(int a, int b) {
        return (Math.abs(a) > Math.abs(b)) ? a : b;
    }

    public static void main(String[]args){
        System.out.println(maxAbs(-10, 7));
    }
}
