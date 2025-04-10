package OPPs.Class_and_Class.Class_and_Class_1;

class Animal {
    void eat() {
        System.out.println("먹는다");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("짖는다");
    }
}

class Engine {
    void start() {
        System.out.println("엔진 시동");
    }
}

class Car {
    Engine engine = new Engine();

    void startCar() {
        engine.start();
    }
}

class Printer {
    void print(Document doc) {
        System.out.println("문서 출력 중...");
    }
}

class Document{}

interface Movable {
    void move();
}

class Robot implements Movable {
    public void move() {
        System.out.println("로봇이 이동함");
    }
}

public class Main {
    
}
