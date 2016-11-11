/**
 * Created by Calcious on 11/11/16.
 */
//every Java project should be in a src folder
public class HelloWorld {
    /**
     *
     * @param args These are the arguments passed through the terminal
     */
    public static void main(String[] args) {
        int dayNumber = 5;

        float price;
        price = (float) 2.3; //type casting

        double anotherPrice = 6.5;


        char vowel;
        vowel = 'e'; //single quotes are reserved for single characters only

        boolean isFriday = true;


        String day = "Friday";


        //What every Java program starts with--use "psvm" to do the same thing
        System.out.println("Hello Mammoth"); //also "sout" for shortcut
        //like console.log in JS--Also DOUBLE QUOTES only in Java for strings
        System.out.print("Hello world!");
        System.out.printf("Hello %s, today is %s, and its the %dth day of the week ", //printf = print format
                "Codeup",
                day,
                dayNumber);
    }
}

