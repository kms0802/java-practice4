package Method;

public class Method_28 {
    public static void printKimFamilly(String[] names) {
        for (String name : names) {
            if (name.startsWith("김")) {
                System.out.println(name);
            }
        }

        
    }
    public static void main(String[]args){
        String[] names = {"김철수" , "이영희" , "김영민"};
        printKimFamilly(names);
    }
}
