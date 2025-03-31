package Method.Method_Challenges;

public class Method_Challenge_10 {
    public static void Adult(String name, int age) {
        if (age >= 20) System.out.println(name + " 님은 성인입니다."); 
        else System.out.println(name + "님은 미성년자 입니다.");
    }

    public static void main(String[]args) {
        Adult("홍길동",25);
    }
}
