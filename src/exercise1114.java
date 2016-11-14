/**
 * Created by Calcious on 11/14/16.
 */
public class exercise1114 {
    public static void main(String[] args) {
//        int i = 0;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }
        int i = 2;
        int sqrt = i * i;
        do{
            System.out.println(i);
            i *= sqrt;
        } while(i <= 1000000);

    }
}
