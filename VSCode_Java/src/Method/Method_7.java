package Method;

public class Method_7 {
    public static boolean isAdult(int age) {
        return age >= 20;
    }

    public static void main(String[]args){
        if (isAdult(22)){
            System.out.println("성인입니다. ");
        } else {
            System.out.println("미성년자입니다. ");
        }
    }
}
