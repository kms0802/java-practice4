package No_Think_Run.Day_4;

enum StaffLevel_1 {
    INTERN("인턴", 0),
    STAFF("사원", 1),
    MANAGER("관리자", 3),
    DIRECTOR("이사", 7);

    private String label;
    private int minYears;

    StaffLevel_1(String label, int minYears){
        this.label = label;
        this.minYears = minYears;
    }

    public String getLabel() {
        return label;
    }

    public int getMinYears() {
        return minYears;
    }
}

public class Day_4_mission_10 {
    public static void main(String[]args) {
        for (StaffLevel_1 level : StaffLevel_1.values()) {
            System.out.println(level + " - " + level.getLabel() + " (최소 연차: " + level.getMinYears() + "년)");
        }
    }
}
