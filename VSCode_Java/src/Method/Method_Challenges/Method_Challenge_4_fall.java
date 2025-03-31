package Method.Method_Challenges;

public class Method_Challenge_4_fall {
    public static int maxOfThree(int a, int b, int c){
        int max = a;

        if (b > max){
            max = b;
        }
        
        if (c > max){
            max = c;
        }
        return max; //fall

    }
    public static void main(String[]args){
        System.out.println(maxOfThree(10, 20, 30));
    }
}
