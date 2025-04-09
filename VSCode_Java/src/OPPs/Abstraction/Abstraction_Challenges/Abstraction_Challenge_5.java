package OPPs.Abstraction.Abstraction_Challenges;

abstract class Vehicle_5 {
    String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void move();
    
    public void printBrand() {
        System.out.println("브랜드 이름: " + brand);
    }
}

class Car_5 extends Vehicle_5 {
    super(brand);
    public move() {
        System.out.println("차가 도로를 달립니다.");
    }
}

class Boat_5 extends Vehicle_5 {
    super(brand);
    public move() {
        System.out.println("바다를 떠다닙니다.");
    }
}

public class Abstraction_Challenge_5 {
    
}
