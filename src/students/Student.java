package students;


/**
 * Created by Calcious on 11/29/16.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int score;

    public Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    void changeScore(int newScore) {
        if (1 > newScore || newScore > 100) {
            throw new IllegalArgumentException("Score myst be a number between 1 and 100");
        }
        score = newScore;
    }
}
