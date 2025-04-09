package OPPs.Polymorphism.Polymorphism_Challenges;

class Vehicle_1 {
    public void move() {
        System.out.println("탈것이 이동합니다.");
    }
}

class Car_1 extends Vehicle_1 {
    @Override
    public void move() {
        System.out.println("자동차가 도로를 달립니다.");
    }
}

class Train_1 extends Vehicle_1 {
    @Override
    public void move() {
        System.out.println("기차가 철도를 달립니다.");
    }
}

public class Polymorphism_Challenge_1 {
    public static void main(String[]args) {
        Vehicle_1 v1 = new Car_1();
        Vehicle_1 v2 = new Train_1();

        v1.move();
        v2.move();
    }
}
