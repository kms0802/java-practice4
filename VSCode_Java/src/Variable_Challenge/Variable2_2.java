package Variable_Challenge;

public class Variable2_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int temp = c;
        
        a = b;
        b = c;
        c = a;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
    }
    
}
