package validation;

/**
 * Created by Moravia on 12/2/16.
 */
public class NonEmptyString implements Validation{
    @Override
    public boolean isValid(Object instance) {
        if (instance instanceof String) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String errorMessage() {
            return "You must enter a string.";
    }
}
