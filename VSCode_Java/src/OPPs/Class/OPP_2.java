package OPPs.Class;

class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + "가 달리고 있습니다! 현재 속도: " + speed + "km/h");
    }

    void stop() {
        speed = 0;
        System.out.println(brand + "가 멈췄습니다. ");
    }
}

public class OPP_2 {
    public static void main(String[]args) {
        Car myCar = new Car();
        myCar.brand = "현대 소나타";
        myCar.speed = 80;

        myCar.drive();
        myCar.stop();
    }
}
