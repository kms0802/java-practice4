package Method;

public class Method_40 {
    public static void printMultiplicationTable(int dan) {
        for (int i = 0; i <= 9; i++) {
            System.out.println(dan + " X " + i + " = "+ (dan * i));
        }

    }
    public static void main(String[]args) {
        printMultiplicationTable(7);
    }
}
