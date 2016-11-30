package OOexercise;
import java.lang.Math;

/**
 * Created by Calcious on 11/30/16.
 */
public class DatCircle {

    private double radius = 0;
    private double circumference = 0;
    private double area = 0;
    private static int numberOfCirclesProduced = 0;


    public DatCircle(double radius){

        this.radius = radius;
        numberOfCirclesProduced++;
    }
    public double getCircumference(){

        this.circumference =  2 * (Math.PI * radius);
        return circumference;
    }

    public static int getNumberOfCirclesProduced() {
        return numberOfCirclesProduced;
    }

    public String getFormattedCircumference(){

        String formattedCircumference = String.format("%.2f", circumference);
        return formattedCircumference;

    }
    public double getArea(){

        this.area = Math.PI * (radius * radius);
        return area;

    }
//    public String getFormattedArea(){
//
//        String formattedArea = String.format("%.2f", area);
//        return formattedArea;
//
//    }
//    private String formatNumber(double x){
//
//    }
//    public static int getObjectCount(){
//
//    }
}
