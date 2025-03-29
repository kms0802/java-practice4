package Arrays;

public class Arrays_5 {
    public static void main(String[]args){
        int[]data = {1, 2, 3, 4, 5};
        // data.length - 1 = 배열의 최댓값이 data[4]이기 때문이다.
        // 0보다 크면 실행되는 구조
        // i--는 4에서 숫자를 줄이는거
        for (int i = data.length - 1; i >= 0; i--){
            System.out.print(data[i] + " ");
        }
    }
}
