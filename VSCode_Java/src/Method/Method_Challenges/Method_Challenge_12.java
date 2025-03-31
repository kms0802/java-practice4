package Method.Method_Challenges;

public class Method_Challenge_12 {
    public static boolean isAdult(String name, int age) {
        if (age >= 20) {
            return true;
        } else return false;
    }

    public static void main(String[]args) {
        System.out.println(isAdult("홍길동", 20));
    }
}
