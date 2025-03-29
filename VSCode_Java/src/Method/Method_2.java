package Method;

public class Method_2 {
    public static void 소개(String 이름, int 나이) {
        System.out.println(이름 + "님은" + 나이 + "살 입니다. ");
    }

    public static void main(String[]args){
        소개("홍길동", 20);
        소개("김영희", 25);
    }
}
