package OPPs.Interface.Interface_3;

interface Movable {
    void move();
}

class Car implements Movable {
    @Override
    public void move() {
        System.out.println("차가 움직입니다.");
    }
}

class Airplane implements Movable {
    @Override
    public void move() {
        System.out.println("비행기가 날아다닙니다.");
    }
}

class Train implements Movable {
    @Override
    public void move() {
        System.out.println("기차가 철로를 다닙니다.");
    }
}

public class Main {
    public static void main(String[]args) {
        Movable[] vehicles = {
            new Car(),
            new Airplane(),
            new Train(),
        };

        for (Movable m : vehicles) {
            m.move();
        }
    }
}
