package OPPs.Inheritance;

class Animal_1 {
    protected String name;
    
    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + "이가 소리를 냅니다.");
    }
}

class Dog_1 extends Animal_1 {
    public void bark() {
        System.out.println(name + "이가 멍멍 짖습니다.");
    }
}

class Cat_1 extends Animal_1 {
    public void meow () {
        System.out.println(name + "이가 야옹 울어요.");
    }
}

public class Inheritance_4 {
    public static void main(String[]args) {
        Dog_1 dog = new Dog_1();
        dog.setName("쵸코");
        dog.speak();
        dog.bark();

        System.out.println();

        Cat_1 cat = new Cat_1();
        cat.setName("나비");
        cat.speak();
        cat.meow();
    }
}
