package OPPs.Abstraction.Abstraction_Challenges;

abstract class Media {
    String title;

    abstract public void play();
    void printInfo() {
        System.out.println(title);
    }
}

class Music extends Media {
    
    public Music(String title) {
        this.title = title;
    }
    
    public void play() {
        System.out.println("음악 재생 중: " + title);
    }
}

class Video extends Media {
    
    public Video(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("비디오 재생 중: " + title);
    }
}

public class Abstraction_Challenge_3 {
    public static void main(String[]args) {
        Media m1 = new Music("Love Dive");
        Media m2 = new Video("Java 튜토리얼");

        m1.play();
        m2.play();
    }
}
