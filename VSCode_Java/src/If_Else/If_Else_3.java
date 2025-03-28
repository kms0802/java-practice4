package If_Else;

public class If_Else_3 {
    public static void main(String[] args)
    {
        int score = 155;

        if (score >= 90 && score <= 100)
        {
            System.out.println("A 등급입니다. ");
        }
        else if (score >= 80 && score <= 89)
        {
            System.out.println("B 등급입니다. ");
        }
        else if (score >= 70 && score <= 79)
        {
            System.out.println("C 등급입니다. ");
        }
        else if (score >= 60 && score <= 69)
        {
            System.out.println("D 등급입니다. ");
        }
        else if (score < 60)
        {
            System.out.println("F 등급입니다. ");
        }
        else
        {
            System.out.println("잘못된 입력값입니다. ");
        }
    }
    
}
