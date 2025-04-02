package OPPs.OPP_Challenges;

public class OPP_Challenge_8 {
    public static void main(String[]args) {
        
        Pet_1 pet = new Pet_1();
        pet.name = "뽀삐";
        pet.species = "불독";
        pet.age = 25;

        Owner_1 owner = new Owner_1();
        owner.name = "고영희";
        owner.pet = pet;

        owner.introducePet();
    }
}
