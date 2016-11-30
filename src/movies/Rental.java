package movies;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Calcious on 11/30/16.
 */
public class Rental {
    // Many movies

    private List<Double> prices = new ArrayList<>();

    public void addRent(double price) {
        prices.add(price);
    }

    public int moviesRentedCount() {
        return prices.size();
    }

    public double totalPrice() {
        double totalPrice = 0;
        for (double price : prices) {

            totalPrice += price;
        }
        return totalPrice;
    }
}
