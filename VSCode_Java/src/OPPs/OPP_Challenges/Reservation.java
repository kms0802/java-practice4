package OPPs.OPP_Challenges;

public class Reservation {
    String userName;
    Movie movie;

    void printReservation() {
        System.out.print("예매자 : " + userName + "\n");
        System.out.print("예매 영화 정보\n");
        movie.printInfo();
    }
}
