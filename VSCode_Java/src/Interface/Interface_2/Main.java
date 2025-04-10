package Interface.Interface_2;

interface Soundable {
    void makeSound();
}

class Dog implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}

class Cat implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

public class Main {
    public static void main(String[]args) {
        Soundable s1 = new Dog();
        Soundable s2 = new Cat();

        s1.makeSound();
        s2.makeSound();
    }
}
