package Class_and_Class.Class_and_Class_Challenges.Class_and_Class_Challenge_1;

class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println(type + "타입 엔진이 작동합니다.");
    }
}

class Car {
    String model;
    Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void drive() {
        System.out.println(model + "차량이 주행을 시작합니다.");
        engine.start();
    }
}
public class Main {
    public static void main(String[]args) {
        Engine v8 = new Engine("V8");
        Car ms = new Car("Mustang", v8);

        ms.drive();
    }
}
