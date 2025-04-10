package Class_and_Class.Class_and_Class_7;

class Keyboard {
    String type;

    public Keyboard(String type) {
        this.type = type;
    }

    public void pressKey(String key) {
        System.out.println("[" + type + "] 키보드로 '" + key + "'키를 눌렀습니다.");
    }
}

class Mouse {
    int dpi;

    public Mouse(int dpi) {
        this.dpi = dpi;
    }

    public void click() {
        System.out.println(dpi + "DPI 마우스로 클릭했습니다.");
    }
}

class Computer {
    String model;
    Keyboard keyboard;
    Mouse mouse;

    public Computer(String model, Keyboard keyboard, Mouse mouse) {
        this.model = model;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void useComputer() {
        System.out.println("컴퓨터 모델: " + model);
        keyboard.pressKey("Enter");
        mouse.click();
    }
}

public class Main {
    public static void main(String[]args) {
        Keyboard kb = new Keyboard("기계식");
        Mouse ms = new Mouse(1600);
        Computer com = new Computer("UltraPC",kb, ms);

        com.useComputer();
    }
}
