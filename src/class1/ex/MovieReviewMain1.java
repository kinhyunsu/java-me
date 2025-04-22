package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";

        MovieReview abouttime = new MovieReview();
        abouttime.title = "어바웃 타임";
        abouttime.review = "인생영화";


        System.out.println("영화제목 : " + inception.title + "영화 리뷰 : " + inception.review );
        System.out.println("영화제목 : " + abouttime.title + "영화 리뷰 : " + abouttime.review );
    }
}
