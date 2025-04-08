package OPPs.Inheritance;

class Electronic {
    protected String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void powerOn() {
        System.out.println(brand + " 전원이 켜졌습니다. ");
    }

    public void powerOff() {
        System.out.println(brand + " 전원이 꺼졌습니다. ");
    }
}

class Phone extends Electronic {
    public void call(String number) {
        System.out.println(brand + "전화기로 " + number + "에 전화겁니다. ");
    }
}

class TV extends Electronic {
    public void changeChannel(int channel) {
        System.out.println(brand + " TV가 " + channel + "번 채널로 바뀌었습니다.");
    }
}

public class Inheritance_6 {
    public static void main(String[]args) {
        Phone phone = new Phone();
        phone.setBrand("삼성");
        phone.powerOn();
        phone.call("010-1234-5678");
        phone.powerOff();

        System.out.println();

        TV tv = new TV();
        tv.setBrand("LG");
        tv.powerOn();
        tv.changeChannel(11);
        tv.powerOff();
    }
}
