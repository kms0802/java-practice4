package OPPs.Abstraction.Abstraction_Challenges;

abstract class Animal_4 {
    String name;

    public Animal_4(String name) {
        this.name = name;
    }

    abstract public void makeSound();
    public void introduce() {
        System.out.println("이름: " + name);
    }
}

class Dog_4 extends Animal_4 {
    public Dog_4(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }
}

class Cat_4 extends Animal_4 {
    public Cat_4(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }
    
}

public class Abstraction_Challenge_4_fall {
    public static void main(String[]args) {
        Animal_4 a1 = new Dog_4("바둑이");
        Animal_4 a2 = new Cat_4("나비");

        a1.introduce();
        a1.makeSound();

        a2.introduce();
        a2.makeSound();
    }
}
