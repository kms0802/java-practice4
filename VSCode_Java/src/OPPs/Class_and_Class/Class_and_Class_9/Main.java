package OPPs.Class_and_Class.Class_and_Class_9;

class Laptop {
    String brand;
    int ramSize;

    public Laptop(String brand, int ramSize) {
        this.brand = brand;
        this.ramSize = ramSize;
    }

    public void showSpecs() {
        System.out.println("노트북 브랜드: " + brand + ", RAM: " + ramSize + "GB");
    }
}


class Student {
    String name;
    Laptop laptop;

    public Student(String name, Laptop laptop) {
        this.name = name;
        this.laptop = laptop;
    }

    public void study() {
        System.out.println(name + "이(가) 공부를 시작합니다.");
        laptop.showSpecs();
    }
}
public class Main {
    public static void main(String[]args) {
        Laptop myLaptop = new Laptop("LG Gram", 16);
        Student student = new Student("지민", myLaptop);

        student.study();
    }
}
