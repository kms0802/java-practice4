package OPPs.Polymorphism;

class Notification_3 {
    public void send(String message) {
        System.out.println("[기본 알림 ] " + message);
    }
}

class EmailNotification_3 extends Notification_3 {
    @Override
    public void send(String message) {
        System.out.println("[이메일 알림] " + message);
    }
}

class SMSNotification_3 extends Notification_3{
    @Override
    public void send(String message) {
        System.out.println("[문자 메시지] " + message);
    }
}
public class Polymorphism_3 {
    public static void main(String[]args) {
        Notification_3 n1 = new EmailNotification_3();
        Notification_3 n2 = new SMSNotification_3();

        n1.send("이벤트에 당첨되셨습니다!");
        n2.send("인증번호는 1234입니다.");
    }
}
