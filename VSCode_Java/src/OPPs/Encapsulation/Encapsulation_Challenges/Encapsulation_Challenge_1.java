package OPPs.Encapsulation.Encapsulation_Challenges;

class Member {
    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("0부터 100까지 숫자중에서 입력해주세요.");
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Member(String name, int age, String email) {
        setName(name);
        setAge(age);
        setEmail(email);
    }
    
    void printInfo() {
        System.out.println("회원 정보");
        System.out.print("이름: " + name + "\n");
        System.out.print("나이: " + age + "\n");
        System.out.print("이메일: " + email + "\n");
    }
    
}

public class Encapsulation_Challenge_1 {
    public static void main(String[]args) {
        Member m = new Member("옥둥이", 21, "닷컴");
        m.setName("홍길동");
        m.setAge(25);
        m.setEmail("hong@example.com");

        m.printInfo();
    }
}
