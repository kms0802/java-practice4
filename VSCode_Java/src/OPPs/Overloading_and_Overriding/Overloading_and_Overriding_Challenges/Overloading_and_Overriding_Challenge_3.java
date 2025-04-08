package OPPs.Overloading_and_Overriding.Overloading_and_Overriding_Challenges;

class Camera {
    public void takePhoto() {
        System.out.println("[기본 카메라] 사진을 찍었습니다. ");
    }

    public void takePhoto(String mode) {
        System.out.println("[기본 카메라] " + mode + "모드로 사진을 찍었습니다. ");
    }
}

class SmartCamera extends Camera {
    @Override
    public void takePhoto() {
        System.out.println("[스마트 카메라] AI 인식후 사진을 찍었습니다.");
    }

    public void takePhoto(String mode, boolean isHDR) {
        if (isHDR == true) {
            System.out.println("[스마트 카메라] HDR + " + mode + " 모드로 촬영!");
        } else {
            System.out.println("[스마트 카메라] " + mode + " 모드로 일반 촬영");
        }
    }
}

public class Overloading_and_Overriding_Challenge_3 {
    public static void main(String[]args) {
        Camera basic = new Camera();
        basic.takePhoto();
        basic.takePhoto("야간");

        System.out.println();

        SmartCamera smart = new SmartCamera();
        smart.takePhoto();
        smart.takePhoto("야간", true);
        smart.takePhoto("인물", false);
    }
}
