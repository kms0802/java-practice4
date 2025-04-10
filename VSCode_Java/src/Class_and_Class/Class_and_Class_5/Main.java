package Class_and_Class.Class_and_Class_5;

class ClassRoom {
    int roomNumber;
    String subject;

    public ClassRoom(int roomNumber, String subject) {
        this.roomNumber = roomNumber;
        this.subject = subject;
    }

    public void printInfo() {
        System.out.println("교실 번호: " + roomNumber + ", 과목: " + subject);
    }
}

class School {
    String name;
    ClassRoom classRoom;

    public School(String name, ClassRoom classRoom) {
        this.name = name;
        this.classRoom = classRoom;
    }

    public void printSchoolInfo() {
        System.out.println("학교 이름: " + name);
        classRoom.printInfo();
    }
}

public class Main {
    public static void main(String[]args) {
        ClassRoom c = new ClassRoom(101, "수학");
        School s = new School("코드고등학교", c);

        s.printSchoolInfo();
    }
}
