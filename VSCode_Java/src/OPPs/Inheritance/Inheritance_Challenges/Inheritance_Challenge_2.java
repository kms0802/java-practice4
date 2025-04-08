package OPPs.Inheritance.Inheritance_Challenges;

class Device {
    protected String brand;
    protected int year;

    public void setDeviceInfo(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void printDeviceInfo() {
        System.out.println("브랜드: " + brand);
        System.out.println("연식: " + year);
    }
}

class Smartphone extends Device {
    private String os;

    public void setOS(String os) {
        this.os = os;
    }

    void printSmartphoneInfo() {
        printDeviceInfo();
        System.out.println("운영체제: " + os);
    }
}

public class Inheritance_Challenge_2 {
    public static void main(String[]args) {
        Smartphone s = new Smartphone();
        s.setDeviceInfo("Samsung", 2023);
        s.setOS("Android");
        s.printSmartphoneInfo();
    }
}
