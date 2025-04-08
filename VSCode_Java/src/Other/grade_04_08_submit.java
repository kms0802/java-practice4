package Other;

import java.util.Scanner;

public class grade_04_08_submit {
    public static void main(String[]args) {
        int kor, eng, mat, sci, sum, intAvg = 0;
        double doubleAVG = 0.00;

        boolean boolRslt = false;
        
        Scanner scanner = new Scanner(System.in);
        
        

        System.out.println("점수들을 입력하세요. ");
        System.out.print("국어 점수: ");
        kor = scanner.nextInt();
        System.out.println();

        System.out.print("영어 점수: ");
        eng = scanner.nextInt();
        System.out.println();

        System.out.print("수학 점수: ");
        mat = scanner.nextInt();
        System.out.println();

        System.out.print("과학 점수: ");
        sci = scanner.nextInt();
        System.out.println();

        sum = kor + eng + mat + sci;
        intAvg = sum / 4;
        doubleAVG = (double) sum / 4;
        
        if (intAvg == doubleAVG) {
            boolRslt = true;
        } else {
            boolRslt = false;
        }

        System.out.print("sum의 값 : " + sum + "\n");
        System.out.print("intAvg의 값 : " + intAvg  + "\n");
        System.out.print("doubleAVG의 값 : " + doubleAVG + "\n");
        System.out.print("boolRsult의 값 : " + boolRslt);

        scanner.close();
    }
}
