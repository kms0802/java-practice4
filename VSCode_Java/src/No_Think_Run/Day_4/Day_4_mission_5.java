package No_Think_Run.Day_4;

enum Membership {
    BRONZE(0.01),
    SILVER(0.03),
    GOLD(0.05),
    VIP(0.10);

    private double rate;

    Membership(double rate) {
        this.rate = rate;
    }

    public int getRewardPoint(int amount) {
        return (int)(amount * rate);
    }
}

public class Day_4_mission_5 {
    public static void main(String[]args) {
        int amount = 20000;
        Membership level = Membership.GOLD;

        int points = level.getRewardPoint(amount);
        System.out.println(level + " 회원이 " + amount + "원을 결제함 -> 적립 포인트: " + points);
    }
}
