package Method.Method_Challenges;

public class Method_Challenge_16 {
    public static void printMaxAndIndex(int[] arr){
        
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        
        System.out.println("최댓값: " + max + ", 위치: " + index);
    }

    public static void main(String[]args){
        
    }
}
