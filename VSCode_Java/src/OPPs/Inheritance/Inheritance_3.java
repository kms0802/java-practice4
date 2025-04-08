package OPPs.Inheritance;

class Employee {
    protected String name;
    protected int id;

    public void showBasicInfo() {
        System.out.println("이름: " + name);
        System.out.println("사번: " + id);
    }
}

class Manager extends Employee {
    private String department;

    public void setManagerInfo(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }


    
    public void showManagerInfo() {
        showBasicInfo();
        System.out.println("부서: " + department);
    }
}

class Developer extends Employee {
    private String language;

    public void setDevInfo(String name, int id, String language) {
        this.name = name;
        this.id = id;
        this.language = language;
    }

    public void showDevInfo() {
        showBasicInfo();
        System.out.println("개발 언어: " + language);
    }
}

public class Inheritance_3 {
    public static void main(String[]args) {
        Manager m = new Manager();
        m.setManagerInfo("이수현", 101, "인사팀");
        m.showManagerInfo();

        System.out.println();

        Developer d = new Developer();
        d.setDevInfo("박지민", 102, "Java");
        d.showDevInfo();
    }
}
