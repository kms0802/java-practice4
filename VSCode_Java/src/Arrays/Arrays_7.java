package Arrays;

public class Arrays_7 {
    public static void main(String[]args){
        int[] data = {1, 4, 7, 10, 13, 16};
        
        for (int i = 0; i < data.length; i++){
            if (data[i] % 2 == 0){
                System.out.println("짝수: " + data[i]);
            }
        }
    }
}
