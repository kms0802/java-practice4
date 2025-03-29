package Method;

public class Method_5 {
    public static void checkPass(int score) {
        if (score >= 60) {
            System.out.println("합격입니다!. ");
        } else {
            System.out.println("불합격입니다!. ");
        }
    }

    public static void main(String[]args){
        checkPass(75);
        checkPass(50);
    }
}
