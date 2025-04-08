package OPPs.Inheritance;

class Animal {
    public void eat() {
        System.out.println("먹는다");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("멍멍!");
    }
}
