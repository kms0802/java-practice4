package OPPs.Overloading_and_Overriding;

class Alarm_2 {
    public void ring() {
        System.out.println("[기본 알람] 삐삐삐");
    }

    public void ring(int volume) {
        System.out.println("[기본 알람] 볼륨 " + volume + "으로 올립니다. ");
    }

    public void ring(String time, int volume) {
        System.out.println("[기본 알람] " + time + "에 불륨 " + volume + "으로 올립니다. ");
    }
}

class SmartAlarm_2 extends Alarm_2 {
    public void ring() {
        System.out.println("[스마트 알람] 진동과 함께 알람이 울립니다.");
    }

    public void ring(boolean isWeekend) {
        if (isWeekend) {
            System.out.println("[스마트 알람] 주말이라 조용히 진동만 울립니다.");
        } else {
            System.out.println("[스마트 알람] 평일이므로 큰 소리로 울립니다.");
        }
    }
}

public class Overloading_and_Overriding_2 {
    public static void main(String[]args) {
        Alarm_2 basic = new Alarm_2();
        basic.ring();
        basic.ring(5);
        basic.ring("07:00",10);

        System.out.println();

        SmartAlarm_2 smart = new SmartAlarm_2();
        smart.ring();
        smart.ring(3);
        smart.ring("08:30", 7);
        smart.ring(true);
    }
}
