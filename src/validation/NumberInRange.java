//package validation;
//
//
///**
// * Created by Calcious on 11/29/16.
// */
//public class NumberInRange implements Validation {
//    public NumberInRange(int min, int max) {
//
//    }
//
//    @Override
//    public boolean isValid(Object value) {
//        if (!(value instanceof Integer)) {
//            return false;
//        } else if(min < (int) value && (int) value < max) {
//            return true;
//        }
//        return false;
//    }
//    @Override
//    public String errorMessage() {
//        return "You must enter an integer within the appropriate range.";
//    }
//}
