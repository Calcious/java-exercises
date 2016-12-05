package movieExercise;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by Calcious on 11/30/16.
 */

public class DatMovie {

    private String title;
    private String category;


    public DatMovie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public boolean isInCategory(String category) {
        return this.category.equalsIgnoreCase(category);
    }

    @Override
    public String toString() {
        return String.format("Movie: %s, belongs to category: %s", title, category);
    }
}

