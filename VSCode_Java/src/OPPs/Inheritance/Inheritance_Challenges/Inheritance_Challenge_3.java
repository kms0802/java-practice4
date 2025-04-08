package OPPs.Inheritance.Inheritance_Challenges;

class Person_3 {
    protected String name;
    protected int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}

class JobPerson_3 extends Person_3 {
    private String job;

    public void setJob(String job) {
        this.job = job;
    }

    void printNotJobLessInfo() {
        printInfo();
        System.out.println("직업: " + job);
    }
}

public class Inheritance_Challenge_3 {
    public static void main(String[]args) {
        JobPerson_3 jobperson = new JobPerson_3();

        jobperson.setName("최예린");
        jobperson.setAge(22);
        jobperson.setJob("디자이너");

        jobperson.printNotJobLessInfo();
    }
}
