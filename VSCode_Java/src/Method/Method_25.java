package Method;

public class Method_25 {
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'F';
    }

    public static void main(String[]args){
        System.out.println(getGrade(85));
    }
}
