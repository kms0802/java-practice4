package OPPs.OPP_Challenges;

public class Owner_1 {
    String name;
    Pet_1 pet;

    void introducePet() {
        System.out.print("주인: " + name + "\n");
        System.out.print("애완동물 정보 \n");
        pet.printInfo();
    }
}
