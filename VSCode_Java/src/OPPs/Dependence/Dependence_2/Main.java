package OPPs.Dependence.Dependence_2;

class Ingredient {
    String name;

    public Ingredient(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println(name + " 재료를 준비합니다.");
    }
}

class Chef {
    public void cook(Ingredient ingredient) {
        System.out.println("요리를 시작합니다.");
        ingredient.describe();
    }
}

public class Main {
    public static void main(String[]args) {
        Ingredient ing = new Ingredient("양파");
        Chef chef = new Chef();

        chef.cook(ing);
    }
}
