package For_while_dowhile;

public class for_java_1 {
    public static void main(String[]args){
        int i, j, k, height;
        
        for (i = 1; i <= 5; i++){
            char ch = (char)('A' + i - 1);

            for (j = 1; j <= i; j++){
                System.out.print(ch + " ");
            }

            System.out.println();
        }

    }
    
}
