import java.util.Scanner;
import java.lang.Math;

/**
 * Created by Calcious on 11/15/16.
 */
public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        int randomNumber = 1 + (int)(Math.random() * ((100 - 1) + 1));

        System.out.println("Please take the time to guess a number between 1 and 100...");
        userInput = sc.nextInt();

        do {
            if (userInput > randomNumber) {
                System.out.println("LOWER");
                userInput = sc.nextInt();
            } else if (userInput < randomNumber) {
                System.out.println("HIGHER");
                userInput = sc.nextInt();
            } else if (userInput == randomNumber){
                System.out.println("Congratulations--you guessed right!");
                break;
            }
        } while (userInput != randomNumber);
    }
}
