//package movieExercise;
//import movies.Movie;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
///**
// * Created by Calcious on 11/30/16.
// */
//public class MovieApp {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        populateMovies();
//
//        System.out.println("Choose a category || Animated | Drama | Horror | SciFi");
//        String category = scanner.next();
//
//        List<Movie> moviesInCategory = new ArrayList<>();
//        for (Movie movie: movies) {
//            if (movie.isInCategory(category)) {
//                moviesInCategory.add(movie);
//            }
//
//        }
//        System.out.println("We found " + moviesInCategory.size() + " movies");
//        for (Movie movie:
//             ) {
//
//        }
//    }
//
//    private static List<Movie> populateMovies() {
//        List<Movie> movies = new ArrayList<>();
//        for (int i = 0; i <= 100; i++) {
//            movies.add(MovieIO.getMovie(i));
//        }
//        return movies;
//    }
//}
