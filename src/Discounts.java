import java.util.Scanner;

/**
 * Created by Calcious on 11/21/16.
 */

public class Discounts {
    public static void main(String[] args) {
        double payment;
        double discount;
        String discountInformation;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your total before the discount: ");
        payment = sc.nextDouble();

        // Get a random number between 1 and 6 (inclusive)
        int random = (int) Math.ceil(Math.random() * 6);

        if(random == 1) {
            discount = ColorDiscounts.RED.applyDiscount(payment);
        } else if(random == 2) {
            discount = ColorDiscounts.BLUE.applyDiscount(payment);
        } else if(random == 3) {
            discount = ColorDiscounts.YELLOW.applyDiscount(payment);
        } else if(random == 4) {
            discount = ColorDiscounts.GREEN.applyDiscount(payment);
        } else if (random == 5) {
            discount = ColorDiscounts.PURPLE.applyDiscount(payment);
        } else {
            discount = ColorDiscounts.PINK.applyDiscount(payment);
        }

        discountInformation = outputDiscount(payment, discount);

        System.out.println(discountInformation);

        sc.close();
    }

    protected static String outputDiscount(double payment, double discount) {
        double total = payment - discount;
        return "The discount for $" + payment + " is $" + discount + " for a grand total of $" + total;
    }
}
