import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

/**
 * Created by Calcious on 11/15/16.
 */
public class GuessGame {
    public static void main(String[] args) {
        int userInput = 0;
        int randomNumber = 1 + (int)(Math.random() * ((100 - 1) + 1));


        System.out.println("Please take the time to guess a number between 1 and 100...");
        exceptAtt(userInput);

        do {
            System.out.println("I'm sorry, but the number you have chosen is out of range...please select another number");
            break;
        } while(userInput < 1 || userInput > 100);

        do {
            if (userInput > randomNumber) {
                System.out.println("LOWER");
                exceptAtt(userInput);
            } else if (userInput < randomNumber) {
                System.out.println("HIGHER");
                exceptAtt(userInput);
            }
        } while (userInput != randomNumber);
        System.out.println("You guessed right!!");
    }

    public static int exceptAtt(int userInput){
        Scanner sc = new Scanner(System.in);
        try {
            userInput = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println();
        }
        return userInput;
    }

}
