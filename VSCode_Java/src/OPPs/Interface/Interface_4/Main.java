package Interface.Interface_4;

interface Calculator {
    int operate(int a, int b);
}

class Add implements Calculator {
    public int operate(int a, int b) {
        return a + b;
    }
}

class Subtract implements Calculator {
    public int operate(int a, int b) {
        return a - b;
    }
}

class Multiply implements Calculator {
    public int operate(int a, int b) {
        return a * b;
    }
}

class Divide implements Calculator {
    public int operate(int a, int b) {
        return a / b;
    }
}

public class Main {
    public static void main(String[]args) {
        Calculator add = new Add();
        Calculator sub = new Subtract();
        Calculator mul = new Multiply();
        Calculator div = new Divide();

        int x = 10, y = 5;

        System.out.println("덧셈: " + add.operate(x, y));
        System.out.println("뺄셈: " + sub.operate(x, y));
        System.out.println("곱셈: " + mul.operate(x, y));
        System.out.println("나눗셈: " + div.operate(x,  y));

        
    }
}
