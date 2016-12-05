/**
 * Created by Calcious on 11/30/16.
 */
public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {

//            y = x - y;

//            y = y + x;

//            y += 2;
//            if (y > 4) {
//                y--;
//            }

//            x++;
//            y = y + x;

            if (y < 5) {
                x++;
                if (y < 3) {
                    x--;
                }
            }
            y += 2;

            System.out.println(x + "" + y + " ");
            x++;
        }
    }
}
