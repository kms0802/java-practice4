package OPPs.Abstraction.Abstraction_Challenges;

abstract class Vehicle_5 {
    String brand;
    public Vehicle_5(String brand) {
        this.brand = brand;
    }

    public abstract void move();
    
    public void printBrand() {
        System.out.println("브랜드 이름: " + brand);
    }
}

class Car_5 extends Vehicle_5 {
    public Car_5(String brand) {
        super(brand);
    }
    public void move() {
        System.out.println("도로를 달립니다.");
    }
}

class Boat_5 extends Vehicle_5 {
    public Boat_5(String brand) {
        super(brand);
    }

    public void move() {
        System.out.println("바다를 떠다닙니다.");
    }
}

public class Abstraction_Challenge_5 {
    public static void main(String[]args) {
        Vehicle_5 v1 = new Car_5("현대");
        Vehicle_5 v2 = new Boat_5("보트코리아");

        v1.printBrand();
        v1.move();

        v2.printBrand();
        v2.move();
    }
}
