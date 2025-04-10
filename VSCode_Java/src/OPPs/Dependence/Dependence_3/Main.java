package OPPs.Dependence.Dependence_3;

class Tool {
    String name;

    public Tool(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println(name + " 도구를 사용합니다.");
    }
}

class Designer {
    public void design(Tool tool) {
        System.out.println("디자인 작업을 시작합니다.");
        tool.use();
    }
}

public class Main {
    public static void main(String[]args) {
        Tool photoshop = new Tool("Photoshop");
        Tool figma = new Tool("Figma");

        Designer d = new Designer();
        d.design(photoshop);
        d.design(figma);
    }
}
