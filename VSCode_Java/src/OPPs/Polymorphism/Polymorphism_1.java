package OPPs.Polymorphism;

class Animal {
    public void sound() {
        System.out.println("동물이 소리를 냅니다. ");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("멍멍! ");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("야옹! ");
    }
}

public class Polymorphism_1 {
    public static void main(String[]args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}
