package validation;

/**
 * Created by Moravia on 12/2/16.
 */
public class Double implements Validation{
    @Override
    public boolean isValid(Object instance) {
        if (instance instanceof Double) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String errorMessage() {
        return "Please enter a valid value (double).";
    }
}
