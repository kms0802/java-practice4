package OPPs.Overloading_and_Overriding.Overloading_and_Overriding_Challenges;

class Messenger {
    public void send(String message) {
        System.out.println("[기본 메신저] 메세지 전송: " + message);
    }

    public void send(String message,int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println("[기본 메신저] (" + i + "/" + count + ") " + message);
        }
    }
}

class SmartMessenger extends Messenger {
    public void send(String message) {
        System.out.println("[스마트 메신저] 알림과 함께 메시지 전송: " + message);
    }

    public void send(String message, boolean isImportant) {
        if (isImportant == true) {
            System.out.println("[스마트 메신저] [긴급]" + message);
        } else {
            System.out.println("[스마트 메신저]" + message);
        }
    }
}

public class Overloading_and_Overriding_Challenge_1 {
    public static void main(String[]args) {
        Messenger m = new Messenger();
        m.send("안녕");
        m.send("안녕", 3);

        System.out.println();

        SmartMessenger sm = new SmartMessenger();
        sm.send("안녕");
        sm.send("안녕", true);
        sm.send("반가워",2);
    }
}
