/**
 * Created by Calcious on 11/21/16.
 */
public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] arrayOfAdjectives = {
                "Bouncy", "Ambitious", "Persnickety", "Lugubrious","Vehement",
                "Vindicated", "Authoritarian", "Nascent", "Infantile", "Austere"
        };

        String[] arrayOfNouns = {
                "Octopus", "Secret Agent", "Rider", "Soldier", "Operative",
                "Oak", "Avacado", "Wok", "Needle", "Zeitgeist"
        };


        for(int i = 1; i < 10; i++) {
            System.out.println(arrayOfAdjectives[randomCall()] + " " + arrayOfNouns[randomCall()]);
        }
    }

    public static int randomCall() {
        int random = (int) Math.ceil(Math.random() * 10 + 1);
        return random;
    }
}
