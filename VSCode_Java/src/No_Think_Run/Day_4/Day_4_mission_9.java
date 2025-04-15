package No_Think_Run.Day_4;

enum StaffLevel {
    INTERN("인턴"),
    STAFF("사원"),
    MANAGER("관리자"),
    DIRECTOR("이사");
    
    private String label;

    StaffLevel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

public class Day_4_mission_9 {
    public static void main(String[]args) {
        StaffLevel level = StaffLevel.MANAGER;
        System.out.println(level + "의 직급 설명은: " + level.getLabel());
    }
}
