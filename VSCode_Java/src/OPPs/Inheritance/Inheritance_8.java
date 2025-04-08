package OPPs.Inheritance;

class Person_1 {
    protected String name;
    protected int age;

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
    }
}

class Athlete_1 extends Person_1 {
    private String sport;
    
    public void setSport(String sport) {
        this.sport = sport;
    }

    public void printAthleteInfo() {
        printInfo();
        System.out.println("종목: " + sport);
    }
}

public class Inheritance_8 {
    public static void main(String[]args) {
        Athlete_1 a = new Athlete_1();
        a.setInfo("박태환", 35);
        a.setSport("수영");
        a.printAthleteInfo();
    }
}
