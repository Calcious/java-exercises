import java.util.Scanner;
import java.lang.Math;

/**
 * Created by Calcious on 11/16/16.
 */
public class PingPong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        int cpuScore = 0;
        int playerScore = 0;

        do {
            System.out.println("Would you like to swing left or swing right? || Press '1' for right or '2' for left");
            userInput = sc.nextInt();

            int ballDir = ballDirection(1 + (int)(Math.random() * ((2 - 1) + 1)));

            if (ballDirection(ballDir) == userInput) {
                System.out.println("Great--you hit the ball back like a champion!  CPU swings!");
                int cpuTurn = ballDirection(ballDir);

                    if(cpuTurn != userInput){
                        System.out.println("CPU misses his swing--point to the USER!");
                        System.out.println("You\'re score || " + playerScore + " || CPU score || " + cpuScore);
                        playerScore++;
                    }
                    else {
                    System.out.println("CPU parries and sends that ball right back--you better act quick!");
                }

            } else {
                System.out.println("Uh oh, you missed--point goes to the CPU!");
                cpuScore++;
                System.out.println("You\'re score || " + playerScore + " || CPU score || " + cpuScore);
            }

        } while (cpuScore < 11 && playerScore < 11);

    }
    public static int ballDirection(int ballDir){
        ballDir = 1 + (int)(Math.random() * ((2 - 1) + 1));
        return ballDir;
    }
}
