package OPPs.Abstraction.Abstraction_Challenges;

abstract class Shape {
    public abstract double getArea();
    public abstract void printInfo();
}

class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea() {
        return width * height;
    }
    public void printInfo() {
        System.out.println("[사각형] 넓이: " + getArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void printInfo() {
        System.out.println("[원] 넓이: " + getArea());
    }
}

public class Abstraction_Challenge_1_fall {
    public static void main(String[]args) {
        Shape s1 = new Rectangle(5,4);
        Shape s2 = new Circle(3);

        s1.printInfo();
        s2.printInfo();
    }
}
