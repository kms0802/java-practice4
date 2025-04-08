package OPPs.Encapsulation;

public class Encapsulation_3 {
    public static void main(String[]args) {
        Person_1 p = new Person_1("김민지", 25, 165.5);

        p.setAge(20);
        p.setHeight(155);

        p.printInfo();
    }
}
