import java.util.Scanner;
import java.lang.Math;

/**
 * Created by Calcious on 11/16/16.
 */
public class PingPong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        int cpuScore = 0;
        int playerScore = 0;


        System.out.println("Would you like to swing left or swing right?");
        userInput = sc.next();


        //ballDirection()--should determine which side of the table the ball is going to using a random generator

        ballDirection(ballDir);

        //if ballDirection() == swingDirection, then cpuTurn(), else cpuScore +1


        if (ballDirection(ballDir).equalsIgnoreCase(userInput)) {

            System.out.println("Great!  CPU swings!");
        } else{
            System.out.println("Uh oh, you missed--point goes to the CPU!");
            cpuScore++;
            System.out.println("You\'re score || " + playerScore + " || CPU score || " + cpuScore);
        }

        //write a function that determines which direction the computer will swing compDirection();




        //the same dynamic for scoring applies to the computer


        //First player to 7 points wins!





    }

    public static String ballDirection(String ballDir){
        String ballDir;
        int randomDirection = 1 + (int)(Math.random() * ((10 - 1) + 1));

        if (randomDirection % 2 == 0) {
            ballDir.equalsIgnoreCase("right");
        } else {
            ballDir.equalsIgnoreCase("left");
        }

        return ballDir;
    }
}
