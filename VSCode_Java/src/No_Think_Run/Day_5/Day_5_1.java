package No_Think_Run.Day_5;


public class Day_5_1 {
    Runnable r = new Runnable() {
        public void run() {
            System.out.println("실행 중");
        }
    };

    public static void main(String[]args) {
        Runnable r = () -> System.out.println("실행 중");
    }
}
