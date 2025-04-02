import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int It = scanner.nextInt();
        
        scanner.nextLine();

        System.out.print("문자를 입력하세요: ");
        String st = scanner.nextLine();

        System.out.print("정수: " + It + ", 문자 : " + st);
        scanner.close();
    }
}
