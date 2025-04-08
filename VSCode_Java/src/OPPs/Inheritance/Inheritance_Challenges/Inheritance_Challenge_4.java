package OPPs.Inheritance.Inheritance_Challenges;

class Device_1 {
    protected String brand;
    protected int bt;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBT(int bt) {
        this.bt = bt;
    }

    void printDevInfo() {
        System.out.println("브랜드: " + brand);
        System.out.println("용량: " + bt + "GB");
    }
}

class SmartPhone_1 extends Device_1 {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    void printSmartPhoneInfo() {
        printDevInfo();
        System.out.println("종류: " + type);
    }
}

public class Inheritance_Challenge_4 {
    public static void main(String[]args) {
        SmartPhone_1 sp = new SmartPhone_1();

        sp.setBrand("LG");
        sp.setBT(500);
        sp.setType("SSD");

        sp.printSmartPhoneInfo();
    }
}
