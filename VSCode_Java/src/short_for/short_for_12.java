package short_for;

public class short_for_12 {
    public static void main(String[]args){
        String[] names = {"John", "Jane", "Alex"};

        for (String name : names) {
            if (name.equalsIgnoreCase("jane")) {
                System.out.println("Jane을 찾았습니다.");
            }
        }
    }
}
