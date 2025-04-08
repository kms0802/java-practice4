package OPPs.Overloading_and_Overriding;

class Printer {
    public void print(String text) {
        System.out.println("[기본 출력] " + text);
    }

    //오버로딩: 매개변수 타입이 다름
    public void print(int number) {
        System.out.println("[기본 숫자 출력] " + number);
    }

    public void print(String text, int copies) {
        for (int i = 1; i <= copies; i++) {
            System.out.println("[복사본 " + i + "] " + text);
        }
    }
}

class ColorPrinter extends Printer {
    // 오버라이딩: 부모의 print(String) 재정의
    @Override
    public void print(String text) {
        System.out.println("[컬러 출력] " + text);
    }

    // 오버로딩 추가
    public void print(String text, String color) {
        System.out.println("[" + color + " 색상출력] " + text);
    }
}

public class Overloading_and_Overriding_1 {
    public static void main(String[]args) {
        Printer basic = new Printer();
        basic.print("문서 출력");
        basic.print(1234);
        basic.print("복사 테스트", 3);

        System.out.println();

        ColorPrinter color = new ColorPrinter();
        color.print("디자인 파일");            // 오버라이딩 된 메서드
        color.print("보고서", 2);      //  부모의 오버로딩 메서드
        color.print("포스터", "빨강");  // 자식 클래스의 오버로딩
    }
}
