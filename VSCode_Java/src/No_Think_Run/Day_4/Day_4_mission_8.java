package No_Think_Run.Day_4;

enum Transport {
    BUS, SUBWAY, TAXI;
}

public class Day_4_mission_8 {
    public static void main(String[]args) {
        Transport choice = Transport.BUS;

        switch (choice) {
            case BUS:
                System.out.println("버스를 이용합니다.");
                break;
            case SUBWAY:
                System.out.println("지하철을 이용합니다.");
                break;
            case TAXI:
                System.out.println("택시를 탑니다.");
                break;
        }
    }
}
