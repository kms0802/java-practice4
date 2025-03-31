package Method;

public class Method_16 {
    public static boolean isEmpty(String text) {
        return text == null || text.trim().isEmpty();
    }

    public static void main(String[]args){
        String text = "     Hello     ";
        System.out.println(text.trim());

        String s = " ";
        System.out.println(s.isEmpty());
    }
}
