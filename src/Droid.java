/**
 * Created by Calcious on 11/19/16.
 */
public class Droid{
    int batteryLevel;

    public Droid(){
        batteryLevel = 100;
    }
    public static void main(String[] args){
        Droid myDroid = new Droid();


        myDroid.activate();
        myDroid.chargeBattery(5);
        myDroid.hover(3);

    }



    public void activate(){
        System.out.print("Activated. How can I help you?");
        batteryLevel = batteryLevel - 5;
        System.out.println("Battery level is: " + batteryLevel);
    }
    public void chargeBattery(int hours) {
        System.out.print("Droid charging...");
        batteryLevel = batteryLevel + hours;
        if (batteryLevel > 100) {
            batteryLevel = 100;
            System.out.print(batteryLevel);
        } else {
            System.out.print(batteryLevel);
        }
    }
    public int checkBatteryLevel(){
        System.out.print(batteryLevel);
        return batteryLevel;
    }
    public void hover(int feet){
        if(feet > 2){
            System.out.print("Error! I cannot hover above 2 feet.");
        } else {
            System.out.print("Hovering...");
            batteryLevel = batteryLevel - 20;
            System.out.print(batteryLevel);
        }
    }
  }
