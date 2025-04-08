package OPPs.Encapsulation;

public class Movie_1 {
    private String title;
    private String director;
    private double rating;

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double Rating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setRating() {
        if (rating >= 0.0 && rating <=10.0) {
            this.rating = rating;
        } else {
            System.out.println("평점은 0.0에서 10.0 사이여야 합니다.");
        }
    }

    public void printInfo() {
        System.out.println("영화 제목: " + title);
        System.out.println("감독: " + director);
        System.out.println("평점: " + rating);
    }
}
