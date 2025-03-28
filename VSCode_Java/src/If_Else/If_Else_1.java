package If_Else;

public class If_Else_1 {

   public static void main(String[] args) {
        int age = 17;

        if (age >= 20) 
        {
            System.out.println("성인입니다. ");
        } 
        else if (age >= 14)
        {
            System.out.println("청소년입니다. ");
        }
        else if (age < 14)
        {
            System.out.println("어린이입니다. ");
        }
    }
   
}
