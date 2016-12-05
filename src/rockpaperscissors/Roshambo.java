//package rockpaperscissors;
//import java.util.Scanner;
//
///**
// * Created by Calcious on 12/1/16.
// */
//public class Roshambo {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String userContinue = "no";
//        int userOppChoice = 0;
//        int userShapeChoice = 0;
//        int compChoice = compShapeChoice(1 + (int)(Math.random() * ((2 - 1) + 1)));
//        int playerScore = 0;
//        int compScore = 0;
//
//        System.out.println("Welcome to the most fantastic Rock/Paper/Scissors game ever!");
//
//        do {
//            System.out.println("Who do you want to play with?  || 1-Computer Player || 2-RockPlayer");
//            userOppChoice = scanner.nextInt();
//
//            if (userOppChoice == 1) {
//                ComputerPlayer computerPlayer = new ComputerPlayer();
//                System.out.println("ComputerPlayer chosen--prepare for SkyNet AI!");
//                System.out.println("Make your move!  Best of 3 wins!");
//                System.out.println("1 || Rock");
//                System.out.println("2 || Paper");
//                System.out.println("3 || Scissors");
//                userShapeChoice = scanner.nextInt();
//                if (userShapeChoice == 1 && compChoice == 3) {
//                    System.out.println("You chose Rock--SkyNet chose Scissors.  You defeated the AI!");
//                    playerScore++;
//                } else if(userShapeChoice == )
//
//            } else if (userOppChoice == 2) {
//                RockPlayer rockPlayer = new RockPlayer();
//                System.out.println("RockPlayer chosen--prepare to get rocked!");
//                System.out.println("Make your move!  Best of 3 wins!");
//                System.out.println("1 || Rock");
//                System.out.println("2 || Paper");
//                System.out.println("3 || Scissors");
//                userShapeChoice = scanner.nextInt();
//
//            }
//
//
//
//
//            //Determine Winner
//            System.out.println("Thanks for playing!  The winner is ||");
//
//            System.out.println("Would you like to play again?");
//            userContinue = scanner.next();
//        } while (userContinue.equalsIgnoreCase("yes"));
//    }
//
//
//    public static int compShapeChoice(int compChoice){
//       compChoice = 1 + (int)(Math.random() * ((2 - 1) + 1));
//        return compChoice;
//    }
//
//
//
////    RCP shapeChoice = RCP.ROCK;
////
////    makeShapeDecision(shapeChoice) {
////
////    }
////
////    private static void makeShapeDecision(RCP shapeChoice) {
////
////        switch (shapeChoice) {
////            case ROCK:
////                System.out.println("Rock!");
////                break;
////            case PAPER:
////                System.out.println("Paper!");
////                break;
////            case SCISSORS:
////                System.out.println("Scissors!");
////        }
////    }
//}
