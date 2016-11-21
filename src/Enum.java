public class Enum {
    public static void main(String[] args) {

        TrafficLightColor lightState = TrafficLightColor.GREEN;
        makeDrivingDecision(lightState);

    }
    private static void makeDrivingDecision(TrafficLightColor color){

        switch(color) {
            case GREEN:
                System.out.println("You can go!");
                break;
            case YELLOW:
                System.out.println("Caution!");
                break;
            case RED:
                System.out.println("Stop!");
        }

    }
}


