package OPPs.Encapsulation;

public class Car_1 {
    private String model;
    private int speed;
    private boolean engineOn;

    public Car_1(String model) {
        this.model = model;
        this.speed = 0;
        this.engineOn = false;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }
}
