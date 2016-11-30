package movies;
import java.util.Scanner;

/**
 * Created by Calcious on 11/30/16.
 */
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("What kind of movie do you want to rent?");
        String type = scanner.next();

        Movie movie = new Movie(type);

        System.out.println("How many days do you want to rent it?");
        int days = scanner.nextInt();

        System.out.println("You'll pay " + movie.price(days));
    }
}
