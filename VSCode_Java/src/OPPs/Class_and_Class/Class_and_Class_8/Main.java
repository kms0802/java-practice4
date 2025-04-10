package Class_and_Class.Class_and_Class_8;

class Weapon {
    String name;
    int power;

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void showInfo() {
        System.out.println("무기 이름: " + name + ", 공격력: " + power);
    }
}

class GameCharacter {
    String characterName;
    Weapon weapon;

    public GameCharacter(String characterName, Weapon weapon) {
        this.characterName = characterName;
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println(characterName + "이(가) 공격합니다!");
        weapon.showInfo();
    }
}

public class Main {
    public static void main(String[]args) {
        Weapon sword = new Weapon("불꽃검", 120);
        GameCharacter hero = new GameCharacter("기사", sword);

        hero.attack();
    }
}
