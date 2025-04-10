package OPPs.Dependence.Dependence_Challenges.Dependence_Challenge_1;

class Battery {
    int level;

    public Battery(int level) {
        this.level = level;
    }

    public void showStatus() {
        System.out.println("베터리 잔량: " + level + "%");
    }
}

class Phone {
    public void checkBattery(Battery b) {
        b.showStatus();
    }
}

public class Main {
    public static void main(String[]args) {
        Battery battery = new Battery(56);

        Phone phone = new Phone();
        phone.checkBattery(battery);
    }
}
