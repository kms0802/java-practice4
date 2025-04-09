package OPPs.Polymorphism.Polymorphism_Challenges;

class Instrument_2 {
    public void play() {
        System.out.println("악기를 연주합니다.");
    }
}

class Piano_2 extends Instrument_2 {
    @Override
    public void play() {
        System.out.println("피아노 소리가 냅니다.");
    }
}

class Guitar_2 extends Instrument_2 {
    @Override
    public void play() {
        System.out.println("기타 소리가 납니다.");
    }
}

public class Polymorphism_Challenge_2 {
    public static void main(String[]args) {
        Instrument_2 i1 = new Piano_2();
        Instrument_2 i2 = new Guitar_2();

        i1.play();
        i2.play();
    }
}
