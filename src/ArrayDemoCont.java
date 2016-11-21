/**
 * Created by Calcious on 11/21/16.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
public class ArrayDemoCont {
    public static void main(String[] args) {
        int[] array1 = {3, 3, 2, 1};
        int[] array2 = Arrays.copyOf(array1, array1.length);
//        boolean areSame;
        Arrays.sort(array1);
// ARRAYS NEED TO BE SORTED BEFORE THEY ARE SEARCHED

        int indexOfTwo;

        indexOfTwo = Arrays.binarySearch(array1, 2);
        System.out.println("The index of the value 2 is: " + indexOfTwo);

//        areSame = Arrays.equals(array1, array2);
//        System.out.println("it is " + areSame + " that the arrays are teh same type and have the same ");
    }
}
