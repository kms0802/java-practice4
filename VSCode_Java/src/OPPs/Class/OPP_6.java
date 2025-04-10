package OPPs.Class;

class Movie {
    String title;
    String genre;
    double rating;

    void printInfo () {
        System.out.println("제목: " + title);
        System.out.println("장르: " + genre);
        System.out.println("평점: " + rating + "점");
    }

    void checkRecommend() {
        if (rating >= 8.0) {
            System.out.println("이 영화는 추천합니다! ");
        } else {
            System.out.println("이 영화는 평점이 낮습니다. ");
        }
    }
}

public class OPP_6 {
    public static void main(String[]args) {
        Movie m1 = new Movie();
        m1.title = "인셉션";
        m1.genre = "SF";
        m1.rating = 8.8;

        m1.printInfo();
        m1.checkRecommend();

        System.out.println();

        Movie m2 = new Movie();
        m2.title = "랜덤 영화";
        m2.genre = "코미디";
        m2.rating = 5.5;

        m2.printInfo();
        m2.checkRecommend();
    }
}
