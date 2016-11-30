package console;

import validation.Validation;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Calcious on 11/29/16.
 */
public class Console {
    private final Scanner input;
    private final PrintStream output;

    public Console(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    public String askForText(String message, Validation validation) {
        output.println(message);
        String text = input.next();

        if (!validation.isValid(text)) {
            output.println(validation.errorMessage());
            return askForText(message, validation);
        }
        return text;
    }
}
