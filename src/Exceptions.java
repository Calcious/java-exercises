import java.util.Scanner;


/**
 * Created by Calcious on 11/15/16.
 */
public class Exceptions {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in).useDelimiter("\n")
        //input.close(); to close any scanners and save memory
        //studentName.trim().isEmpty()
        Scanner sc = new Scanner(System.in);
        String studentName1 = "Justin";
        int studentAge1 = 31;
        String studentReason1 = "I want to learn programming to learn something both creative and constructive";
        String userInput;
        String userContinue = "no";

        do {
            System.out.println("Please enter the name one of the students: " + studentName1);
            userInput = sc.next();

            if (userInput.equalsIgnoreCase(studentName1)) {
                System.out.println("What information would you like to know--age or reason for programming?");
                userInput = sc.next();
                if (userInput.equalsIgnoreCase("age")) {
                    System.out.println(studentName1 + "\'s age is: " + studentAge1);
                    break;
                } else if (userInput.equalsIgnoreCase("reason") || userInput.equalsIgnoreCase("reason for programming")){
                    System.out.println(studentName1 + "\'s reason is: " + studentReason1);
                    break;
                }
            } else {
                System.out.println("That student is not enrolled here, would you like to continue?");
                userContinue = sc.next();
                if (userContinue.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("Returning to main menu...");
                    userContinue.equals("yes");
                }
            }
        } while (!userContinue.equalsIgnoreCase("no"));

        }


}
