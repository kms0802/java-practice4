package Method.Method_Challenges;

public class Method_Challenge_11 {
    public static boolean checkAdult(String name, int age) {
        if (age >= 20) {
            return true;
        } else return false;
    }

    public static void main(String[]args) {
        System.out.println(checkAdult("홍길동",20));
    }
}
