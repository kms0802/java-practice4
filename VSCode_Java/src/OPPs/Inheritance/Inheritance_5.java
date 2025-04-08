package OPPs.Inheritance;

class Vehicle {
    protected String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void move() {
        System.out.println(brand + " 이동 중...");
    }
}

class Car extends Vehicle {
    private int fuel;

    public void refuel(int amount) {
        fuel = fuel + amount;
        System.out.println(brand + "에 연료를 " + amount + "리터 주입했습니다. ");
    }
}

class Bicycle extends Vehicle {
    private int pedalSpeed;

    public void pedal(int speed) {
        pedalSpeed = speed;
        System.out.println(brand + " 자전거가 폐달 속도 " + speed + "으로 달립니다. ");
    }
}

public class Inheritance_5 {
    public static void main(String[]args) {
        Car car = new Car();
        car.setBrand("현대");
        car.move();
        car.refuel(30);

        System.out.println();

        Bicycle bike = new Bicycle();
        bike.setBrand("삼천리");
        bike.move();
        bike.pedal(15);
    }
}
