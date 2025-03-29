package Arrays;

public class Arrays_9 {
    public static void main(String[]args){
        String[] names = {"홍길동", "김영희", "이철수"}; // 배열을 나열
        String target = "김영희"; //타겟 지정

        boolean found = false; // ? // 찾으면 기억하는 역할

        for (int i = 0; i < names.length; i++){ // name.length = 배열의 최대까지 실행
            // i = 0, names.length보다 작은상태임 그래서 실행 (names.length값은 최대 3, 배열은 2)
            // i = 1, names.length보다 작은상태임 그래서 실행
            if (names[i].equals(target)){ // names[i]의 값이 target의 값과 같으면 실행
                // i = 0, names[0]은 타겟과 같지않음, 따라서 for문안에있는 명령어가 실행되지 않는다.
                // i = 1, names[0]의 값이 김영희, target값도 김영희므로 명령어가 실행된다.
                found = true; // boolean값 true
                // i = 1, found값을 true로 바꿔준다.
                // found = true값은 for문 안에서만 적용되므로 밖에 있는 if문과는 상관 x
                System.out.println(target + "을 찾았습니다! 인덱스: " + i);
                // i = 1, 실행
                break; // if문 빠져나오기 : 왜 빠져나오는지는 모름 // 찾았는데도 또 찾는 불상사 방지
                // i = 1, 명령문을 빠져나온다.
            }
        }
    
    if (!found) { // found값이 아니면 실행(?) = true일 경우 실행
        System.out.println("이름을 찾을 수 없습니다. ");
    }
    }
}
