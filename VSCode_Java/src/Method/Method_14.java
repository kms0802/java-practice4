package Method;

public class Method_14 {
    public static void checkAdult(String name, int age) {
        if (age >= 20) {
            System.out.println(name + "님은 성인입니다. ");
        } else {
            System.out.println(name + "님은 미성년자입니다. ");
        }
    }
    public static void main(String[]args){
        checkAdult("홍길동", 18);
    }
}
