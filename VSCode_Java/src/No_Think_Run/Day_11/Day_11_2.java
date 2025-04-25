package No_Think_Run.Day_11;



public class Day_11_2 {
    public static <T> void printItem(T item) {
        System.out.println("출력: " + item);
    }

    public static void main(String[]args) {
        printItem("Hello, Java!");
        printItem(123);
        printItem(3.14);
        printItem(true);
    }
}
