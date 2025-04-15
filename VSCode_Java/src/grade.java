import java.util.Scanner;

public class grade {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해주세요.");
        int score = scanner.nextInt();
        String grade = "";
        
        if (score <= 100 && score >= 90) {
            grade = "A";
        } else if (score <= 90 && score >= 80) {
            grade ="B";
        } else if (score <= 80 && score >= 70) {
            grade = "C";
        } else if (score <= 70 && score >= 60) {
            grade = "D";
        } else if (score <= 60 && score >= 0) {
            grade = "F";
        } else {
            grade = "성적은 0부터 100까지입니다.";
        }
            scanner.close();
    }
    
}
