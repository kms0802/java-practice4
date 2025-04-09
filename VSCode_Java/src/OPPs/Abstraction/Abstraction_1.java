package OPPs.Abstraction;

abstract class Animal_1 {
    public abstract void sound();

    public void sleep() {
        System.out.println("쿨쿨 자는 중...");
    }
}

class Dog_1 extends Animal_1 {
    @Override
    public void sound() {
        System.out.println("멍멍!");
    }
}

class Cat_1 extends Animal_1 {
    @Override
    public void sound() {
        System.out.println("야옹!");
    }
}
 
public class Abstraction_1 {
    public static void main(String[]args) {
        Animal_1 a1 = new Dog_1();
        Animal_1 a2 = new Cat_1();

        a1.sound();
        a2.sound();
        a1.sleep();
    }
}
