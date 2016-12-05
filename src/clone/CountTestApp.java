package clone;

/**
 * Created by Calcious on 12/5/16.
 */
public class CountTestApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        countable alligator = new Alligator();

        System.out.println("Counting alligators...");
        CountUtil.count(alligator, 3);

        System.out.println("Counting sheep...");
        Sheep blackie = new Sheep("Blackie");


        CountUtil.count(blackie,2);
        Sheep dolly = (Sheep) blackie.clone();

        dolly.setName("Dolly");

        CountUtil.count(dolly, 3);

    }
}
