package movies;
import java.util.Scanner;

/**
 * Created by Calcious on 11/30/16.
 */
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String rentAgain = "no";
        Rental rental = new Rental();

        do {


            System.out.println("What kind of movie do you want to rent?");
            String type = scanner.next();

            Movie movie = new Movie(type);

            System.out.println("How many days do you want to rent it?");
            int days = scanner.nextInt();

            rental.addRent(movie.price(days));

            // Tell don't ask

            System.out.println("You'll pay " + movie.price(days));  //encapsulation

            System.out.println("Would you like to rent another movie?");
            rentAgain = scanner.next();

        } while (rentAgain.equalsIgnoreCase("yes"));
        System.out.println("You rented " + rental.moviesRentedCount() + " and your total price is $" + rental.totalPrice());
    }
}
