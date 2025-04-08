package OPPs.Overloading_and_Overriding.Overloading_and_Overriding_Challenges;

class MusicPlayer {
    public void play(String song) {
        System.out.println("[기본 플레이어] 재생 중: " + song);
    }
    public void play(String song, int repeat) {
        for (int i = 1; i <= repeat; i++) {
            System.out.println("[기본 플레이어] (" + i + "/" + repeat + ")" + song);
        }
    }
}

class SmartMusicPlayer extends MusicPlayer {
    public void play(String song) {
        System.out.println("[스마트 플레이어] 고음질 재생: " + song);
    }

    public void play(String song, boolean shuffle) {
        if (shuffle == true) {
            System.out.println("[스마트 플레이어] 무작위 재생: " + song);
        } else {
            System.out.println("[스마트 플레이어] 순차 재생: " + song);
        }
    }
}

public class Overloading_and_Overriding_Challenge_2 {
    public static void main(String[]args) {
        MusicPlayer basic = new MusicPlayer();
        basic.play("Dynamite");
        basic.play("Dynamite", 2);

        System.out.println();

        SmartMusicPlayer smart = new SmartMusicPlayer();
        smart.play("Dynamite");
        smart.play("Butter", true);
        smart.play("Butter", 3);
    }
}
