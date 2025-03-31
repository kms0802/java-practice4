package Method;

public class Method_45 {
    public static void printStarTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[]args) {
        printStarTriangle(4);
    }
}
