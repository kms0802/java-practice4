package No_Think_Run.Day_4;

enum Operation {
    PLUS("+") {
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    MINUS("-") {
        public int calculate(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        public int calculate(int a, int b) {
            return a * b;
        }
    } ,
    DIVINE("/") {
        public int calculate(int a, int b) {
            return a / b;
        }
    };

    private String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public abstract int calculate(int a, int b);
}
    


public class Day_4_mission_12 {
    public static void main(String[]args) {
        int a = 10;
        int b = 2;

        for (Operation op : Operation.values()) {
            int result = op.calculate(a, b);
            System.out.println(a + " " + op.getSymbol() + " " + b + " = " + result);
        }
    }
}
