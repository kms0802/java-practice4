package Method;

public class Method_4 {
    public static void repeatPrint(String text, int count){
        for (int i = 0; i < count; i++){
            System.out.println(text);
        }
    }
    public static void main(String[]args){
        repeatPrint("안녕!", 3);
    }
}
