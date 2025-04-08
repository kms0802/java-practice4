package OPPs;

public class OPP_13 {
    public static void main(String[]args) {
        Book_1 b1 = new Book_1("자바의 정석", 30000);
        Book_1 b2 = new Book_1("파이썬 코딩", 25000);

        b1.printInfo();
        b2.printInfo();

        b1.comparePrice(b2);
    }
}
