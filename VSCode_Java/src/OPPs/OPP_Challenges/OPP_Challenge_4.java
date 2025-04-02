package OPPs.OPP_Challenges;

class Student {
    String name;
    int score;

    public int getScore(){
        return score;
    }
}

public class OPP_Challenge_4 {
    public static void main(String[]args) {
        Student student1 = new Student();
        student1.name = "홍길동";
        student1.score = 85;
        
        Student student2 = new Student();
        student2.name = "삐삐";
        student2.score = 0;

        Student student3 = new Student();
        student3.name = "예삐";
        student3.score = 45;

        Student[] students = {student1, student2, student3};

        int sum = 0;
        for (int i = 0; i < students.length; i++){
            sum = sum + students[i].getScore();
        }

        double average = (double) sum / students.length;

        System.out.println("총점: " + sum);
        System.out.println("평균 점수: " + average);
    }
}
