package OPPs.Abstraction.Abstraction_Challenges;

abstract class Shape {
    public abstract double getArea();
    public abstract void printInfo();
}

class Rectangle extends Shape {
    public double getArea(double width, double height) {
        double rectangle = width * height;
        return rectangle;
    }
    public void printInfo() {

    }
}

public class Abstraction_Challenge_1 {
    
}
