package movies;

/**
 * Created by Calcious on 11/30/16.
 */
public class Movie {
    private String type;
    /*
    These are instance variables and not static--they are always changing.  Also, they need to be private
    because only this class needs to access them.
     */

    public Movie(String type) {
        this.type = type;
    }

    public double price(int days){
        double price = 0;
        switch (type) {
            case "regular":
                price = 2;
                if (days > 1) {
                    price += 1.5 * (days - 1);
                }
                break;
            case "new":
                price = 3 * days;
                break;
            case "children":
                if (days > 3) {
                    price = 4.5 + (1.25 * (days - 3));
                } else{
                    price = 1.5 * days;
                }
                break;
            default:
                System.out.println("that's not a valid type");
        }
        return price;
    }

}
