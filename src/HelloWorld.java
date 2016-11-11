/**
 * Created by Calcious on 11/11/16.
 */

import java.util.Scanner;

//every Java project should be in a src folder
public class HelloWorld {
    /**
     *
     * @param args These are the arguments passed through the terminal
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int width;
        int length;
        String userInput = "no";

//        do {
//
//            System.out.println("What is the length of the classroom?");
//            int length = sc.nextInt();
//
//            System.out.println("What is the width of the classroom?");
//            int width = sc.nextInt();
//
//            int area = length * width;
//            System.out.println(area);
//
//            System.out.println("Would you like to proceed?  Yes or no?");
//            String yes = "Yes";
//            String no = "No";
//
//        } while (yes);

        do {

            System.out.print("Welcome to the room calculator");
            System.out.print("Enter width: ");
            width = sc.nextInt();
            System.out.print("Enter length: ");
            length = sc.nextInt();

            System.out.println("The room has a perimeter of " + perimeter(width, length));
            System.out.println("The room has an area of " + area(width, length));

            System.out.println("Thank you for using the room calculator.  Would you like to calculate another room?");
            userInput = sc.next();
        } while (userInput.equals("yes"));
        System.out.println("Thank you for using the room calculator");
    }

    public static int perimeter(int width, int height){
        return 2 * width + 2 * height;
    }

    public static int area(int width, int height){
        return width * height;
    }
}

