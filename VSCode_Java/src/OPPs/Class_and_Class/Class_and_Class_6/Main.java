package OPPs.Class_and_Class.Class_and_Class_6;

class Camera {
    int resolution;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public void takePhoto() {
        System.out.println(resolution + "MP 화질로 사진을 촬영합니다. ");
    }
}

class SmartPhone {
    String model;
    Camera camera;

    public SmartPhone(String model, Camera camera) {
        this.model = model;
        this.camera = camera;
    }

    public void showInfo() {
        System.out.println("스마트폰 모델: " + model);
        camera.takePhoto();
    }
}

public class Main {
    public static void main(String[]args) {
        Camera cam = new Camera(48);
        SmartPhone phone = new SmartPhone("Galaxy S24", cam);

        phone.showInfo();
    }
}
