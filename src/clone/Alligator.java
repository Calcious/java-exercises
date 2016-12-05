package clone;

/**
 * Created by Calcious on 12/4/16.
 */
public class Alligator implements countable {

    private int alligatorCount = 0;
    private String alligatorCountString;


    @Override
    public void incrementCount() {

        alligatorCount++;

    }

    @Override
    public void resetCount() {

        alligatorCount = 0;

    }

    @Override
    public int getCount() {

        return alligatorCount;
    }

    @Override
    public String getCountString() {

            return alligatorCount + " alligator";

    }
}
