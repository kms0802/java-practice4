package Interface;

interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("기타 소리가 납니다.");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("피아노 소리가 납니다.");
    }
}

public class Main {
    public static void main(String[]args) {
        Playable g = new Guitar();
        Playable p = new Piano();

        g.play();
        p.play();
    }
}
