package No_Think_Run.Day_12;

public class Day_12_2 {
   public enum Menu { START, STOP, EXIT}

   public static void main(String[]args) {
        Menu m = Menu.START;

        switch (m) {
            case START:
                System.out.println("시작!");
                break;
            case STOP:
                System.out.println("중지!");
                break;
            case EXIT:
                System.out.println("종료!");
                break;
        }
   }
}
