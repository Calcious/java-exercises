

/**
 * Created by Calcious on 11/14/16.
 */
import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
//        for(int i = 0; i <= 100; i++) {
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//        String userInput = "No";
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Please enter an integer");
//            int userInt = sc.nextInt();
//            int squareInt = userInt * userInt;
//            int cubeInt = userInt * userInt * userInt;
//
//            System.out.println(squareInt);
//            System.out.println(cubeInt);
//
//            System.out.println("Would you like to continue?");
//            userInput = sc.next();
//        } while (userInput.equals("Yes"));
        Scanner sc = new Scanner(System.in);
        int numGrade;
        String gradeInput = "No";
        do {
            System.out.println("Please enter your grade");
            numGrade = sc.nextInt();

            if (numGrade >= 100) {
                System.out.println("You got an A");
            } else if (numGrade >= 80 && numGrade <= 88) {
                System.out.println("You got a B");
            } else if (numGrade >= 67 && numGrade <= 80) {
                System.out.println("You got a C");
            } else if (numGrade >= 60 && numGrade <= 66) {
                System.out.println("You got a D");
            } else if (numGrade >= 0 && numGrade <= 60) {
                System.out.println("You got an F");
            }
            System.out.println("Would you like to enter another grade?");
            gradeInput = sc.next();
        } while (gradeInput.equals("Yes"));

    }
}
