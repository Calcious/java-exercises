package clone;

/**
 * Created by Calcious on 12/4/16.
 */
class CountUtil {
    static void count(countable c, int maxCount){

        for (int i = 0; i < maxCount; i++) {
            c.incrementCount();
            System.out.println(c.getCountString());
        }
    }
}
