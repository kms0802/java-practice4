package OPPs.Overloading_and_Overriding.Overloading_and_Overriding_Challenges;

class Calculator {
    public void calculate(int a, int b) {
        System.out.print("[기본 계산기] 결과: ");
        System.out.println(a + b);
    }
    
    public void calculate(int a) {
        System.out.print("[기본 계산기] 결과: ");
        System.out.println(a * 2);
    }
    
    public void calculate(double a, double b) {
        System.out.print("[기본 계산기] 결과: ");
        System.out.println(a + b);
    }
}

class EngineeringCalculator extends Calculator {
    
    @Override
    public void calculate(int a) {
        System.out.println("[공학용 계산기] 고급 연산 수행: " + a);
    }

    public void calculate(double a) {
        System.out.println("[공학용 계산기] 공학용 실수 연산: " + a);
    }
    
    @Override
    public void calculate(int a, int b) {
        System.out.println("[기본 계산기] 결과: " + (a + b));
    }
}

public class Overloading_and_Overriding_Challenge_4 {
    public static void main(String[]args) {
        Calculator basic = new Calculator();
        basic.calculate(5,5);
        basic.calculate(10);
        basic.calculate(4.5, 5.0);

        System.out.println();

        EngineeringCalculator eng = new EngineeringCalculator();
        eng.calculate(10);
        eng.calculate(12.34);
        eng.calculate(7,8);
    }
}
