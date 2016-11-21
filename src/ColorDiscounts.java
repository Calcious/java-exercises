/**
 * Created by Calcious on 11/21/16.
 */
public enum ColorDiscounts {
    RED(.00),
    BLUE(.10),
    YELLOW(.25),
    GREEN(.35),
    PURPLE(.50),
    PINK(1);

    public final double discountPercentage;

    ColorDiscounts(double discountPercentage){
        this.discountPercentage = discountPercentage;
    }

    public double applyDiscount(double payment) {
        double totalAfterDiscount = this.discountPercentage * payment;
        return totalAfterDiscount;
    }


}



