package OPPs.Abstraction.Abstraction_Challenges.Abstraction_Challenge_8_java;

abstract class Shape {
    public abstract double getArea();
}

class Rectangle extends Shape {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[]args) {
        Shape s1 = new Rectangle(5, 10);
        Shape s2 = new Circle(3);

        System.out.println("사각형 면적: " + s1.getArea());
        System.out.println("원 면적: " + s2.getArea());
    }
}
