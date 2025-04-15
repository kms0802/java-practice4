package No_Think_Run.Day_4;

enum CoffeeMenu {
    AMERICANO("아메리카노", 1500),
    LATTE("카페라떼", 2500),
    MOCHA("카페모카", 3000);

    private String label;
    private int price;

    CoffeeMenu(String label, int price) {
        this.label = label;
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public int getPrice() {
        return price;
    }
}

public class Day_4_mission_11 {
    public static void main(String[]args) {
        for (CoffeeMenu coffee : CoffeeMenu.values()) {
            System.out.println(coffee.getLabel() + coffee.getPrice());
        }
    }
}
