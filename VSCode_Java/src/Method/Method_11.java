package Method;

public class Method_11 {
    public static void printChar(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(ch);
        }
        System.out.println();
    }

    public static void main(String[]args){
        printChar('*', 5);
    }
}
