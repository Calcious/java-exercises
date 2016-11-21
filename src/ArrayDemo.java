/**
 * Created by Calcious on 11/21/16.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int numberOfElementsOnAnArray = 10; //YOU CAN GET THIS FROM THE USER VIA A SCANNER


        int[] arrayOfInts;
        arrayOfInts = new int[5];

        //VARIABLES OR CONSTANTS CAN GO INTO BRACKETS AS LONG AS THEY ARE INTEGERS

        boolean[] arrayOfBooleans = new boolean[2];
        System.out.println(arrayOfBooleans[0]);
        System.out.println(arrayOfBooleans[1]);
//        System.out.println(arrayOfBooleans[2]);  LEADS TO AN ERROR BECAUSE IT EXCEEDS THE LIMIT OF THE ARRAY

        //SHORTCUT SYNTAX
        String[] arrayOfStrings = {"Clean Code", "Head First Java", "Pragmatic Programmer"};

        //ENHANCED FOR LOOP
        for (String title : arrayOfStrings) {
            System.out.println(title);
        }
        double[] prices = {1.99, 2.99, 1.95, 149.99};
        double sum = 0;
        double average;

        //CLASSIC FOR LOOP

        for(int i = 0; i < prices.length; i++){
            sum += prices[i];
        }

        //ANOTHER ENHANCED FOR LOOP

        for (double price : prices) {
            sum += price;
        }
        average = sum / prices.length;
        System.out.println("The sum of these prices is " + sum + " while the average of prices is " + average);
    }
}
