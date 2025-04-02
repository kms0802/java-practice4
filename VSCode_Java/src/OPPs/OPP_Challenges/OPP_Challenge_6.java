package OPPs.OPP_Challenges;

class Car {
    String model;
    int year;

    void printCar() {
        System.out.println("모델: " + model + ", 연식: " + year);
    }
}

class Driver {
    String driverName;
    Car car;

    void drive() {
        System.out.println(driverName + "님이 운전 중입니다. ");
        car.printCar();
    }
}

public class OPP_Challenge_6 {
    public static void main(String[]args) {
        
        Car car = new Car();
        car.model = "소나타";
        car.year = 2020;

        Driver driver = new Driver();
        driver.driverName = "홍길동";
        driver.car = car;

        driver.drive();
    }
}
