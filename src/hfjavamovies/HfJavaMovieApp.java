package hfjavamovies;

/**
 * Created by Calcious on 11/30/16.
 */
public class HfJavaMovieApp {
    public static void main(String[] args) {
        DatHfJavaMovie one = new DatHfJavaMovie();

        one.title = "Gone With the Stock";
        one.genre = "Tragic";
        one.rating = -2;

        DatHfJavaMovie two = new DatHfJavaMovie();

        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;

        DatHfJavaMovie three = new DatHfJavaMovie();

        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}
