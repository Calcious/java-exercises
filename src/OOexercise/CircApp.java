package OOexercise;
import java.util.Scanner;

/**
 * Created by Calcious on 11/30/16.
 */
public class CircApp {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        //Static means we can call methods without creating an object

        double radius = 0;
        String userContinue = "no";

        System.out.println("Welcome to the CIRCLE INFO GENERATOR |||||  THE ONE-STOP DEVICE FOR GETTING AREA AND CIRCUMFERENCES!");

        do {
            System.out.println("Please enter a radius:");
            radius = input.nextDouble();

            DatCircle circle = new DatCircle(radius);

            System.out.println("Area ||  " + circle.getArea());
            System.out.println("Circumference ||  " + circle.getCircumference());

            System.out.println("Would you like to enter another circle?");
            userContinue = input.next();

        } while (userContinue.equalsIgnoreCase("yes"));

        System.out.println("Total number of circles ||  " + DatCircle.getNumberOfCirclesProduced());
    }
}
