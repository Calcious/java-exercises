import java.util.Scanner;

/**
 * Created by Calcious on 11/14/16.
 */

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        String userContinue;

        //        System.out.println(sumNum(5, 6));
//        System.out.println(subNum(10, 12));
//        System.out.println(multNum(15, 7));
//        System.out.println(divNum(20, 4));
//        System.out.println(modNum(10, 3));

        do {
            System.out.println("Please enter an integer from 1 to 10");
            userInput = sc.nextInt();
            if(userInput >= 1 && userInput <=10) {
                System.out.println(factorTran(userInput));
            } else
                break;
            System.out.println("Would you like to enter another number?");
            userContinue = sc.next();
        } while (userContinue.equalsIgnoreCase("Yes"));
    }

    private static long factorTran(int userInput) {

        for(int i = 1; i < userInput; i++){
            System.out.println(i + "*" + userInput);
            System.out.println(i );

    }
     return userInput;
    }

//    public static int sumNum(int num1, int num2) {
//
//        return (num1 + num2);
//    }
//
//    public static int subNum(int num1, int num2) {
//
//        return (num1 - num2);
//    }
//
//    public static int multNum(int num1, int num2) {
//
//        return (num1 * num2);
//    }
//
//    public static int divNum(int num1, int num2) {
//
//        return (num1 / num2);
//    }
//    public static int modNum(int num1, int num2) {
//
//        return (num1 % num2);
//    }

}
