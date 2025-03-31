package Method.Method_Challenges;

public class Method_Challenge_13 {
    public static char getGrade(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score < 90) {
            return 'B';
        } else if (score >= 70 && score < 80) {
            return 'C';
        } else if (score >= 60 && score < 70) {
            return 'D';
        } else if (score > 100 || score < 0) {
            return 'X';
        } else return 'F';    
    }

    public static void main(String[]args) {
        System.out.println(getGrade(95));
        System.out.println(getGrade(71));
        System.out.println(getGrade(82));
    }
}
