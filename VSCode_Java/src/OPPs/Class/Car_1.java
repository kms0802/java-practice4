package OPPs.Class;

public class Car_1 {
    String model;
    int year;

    public Car_1() {
        this.model = "이름 없는 차";
        this.year = 2000;
    }

    public Car_1(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("차량 정보 - 모델: " + model + ", 연식: " + year);
    }
}
