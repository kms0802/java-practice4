package OPPs.OPP_Challenges;

public class OPP_Challenge_9 {
    public static void main(String[]args) {
        
        Movie movie = new Movie();
        movie.title = "포청천";
        movie.genre = "액션";
        movie.runningTime = 2;

        Reservation res = new Reservation();
        res.userName = "길동이";
        res.movie = movie;

        res.printReservation();
    }
}
