package Interface.Interface_Challenges.Interface_Challenge_1;

interface Calculator {
    int operate(int a, int b);
}

class Add implements Calculator {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}

class Multiply implements Calculator {
    @Override
    public int operate(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[]args) {
        Calculator add = new Add();
        Calculator mul = new Multiply();

        System.out.println("덧셈 결과: " + add.operate(10, 5));
        System.out.println("곱셈 결과: " + mul.operate(10, 5));
    }
}
