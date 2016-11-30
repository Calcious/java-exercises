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

        System.out.println("How many days do you want to rent it?");
        int days = scanner.nextInt();


        double price = 0;
        switch (type) {
            case "regular":
                price = 2;
                if (days > 1) {
                    price += 1.5 * (days - 1);
                }
                break;
            case "new":
                price = 3 * days;
                break;
            case "children":
                if (days > 3) {
                    price = 4.5 + (1.25 * (days - 3));
                } else{
                    price = 1.5 * days;
                }
                break;
            default:
                System.out.println("that's not a valid type");
        }
        System.out.println("You'll pay " + price);
    }
}
