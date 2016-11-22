/**
 * Created by Calcious on 11/21/16.
 */
import java.util.Scanner;

public class BattingStatistics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userInputAtBat;
        int userInputBasesEarned;
        String playerName;
        String userContinue = "no";
        String userInputPlayer;
        int atBats = 0;
        int basesAch = 0;
        int atbatsWithOne = 0;
//        String[] arrayOfPlayers= {};



        do {

        System.out.println("What is the payer's name?");
            playerName = sc.next();


        System.out.println("Please enter the number of at-bats for this player: ");
        userInputAtBat = sc.nextInt();
            atBats = userInputAtBat;

            int[] atBatResults = new int[userInputAtBat -1];
            System.out.println(userInputAtBat);


            for(int i = 0; i <= atBatResults.length; i++) {
                System.out.println("Please enter the number of bases earned per at-bat: " + (i + 1));
                userInputBasesEarned = sc.nextInt();

                if(userInputBasesEarned >= 1){
                    atbatsWithOne++;
                    System.out.println("# of at bats with one or more-- " +  atbatsWithOne);
                }

                System.out.println("During at-bat #" + (i + 1) + ", " + playerName + " earned " + userInputBasesEarned);
                userInputAtBat--;
                basesAch += userInputBasesEarned;
            }
            System.out.println("Total # of atBats--" + atBats);

            double sluggingPercentage = basesAch / atBats;
            double battingAverage = atbatsWithOne / atBats;
            System.out.println("Number of at bats with one or more runs ||" + atbatsWithOne);
            System.out.println("Slugging percentage for " + playerName + "||" + sluggingPercentage);
            System.out.println("Batting average for " + playerName + "||" + battingAverage);



            System.out.println("Would you like the stats of another player?");
            userContinue = sc.next();
        } while (userContinue.equalsIgnoreCase("Yes"));

    }






    }
