package Variable_Challenge;

public class Variable2 {
    public static void main(String[] args){
        int a = 5;
        int b = 10;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 변수를 서로 바꿀때는 임시 공간 필요 (ex : temp)
    }
    
}
