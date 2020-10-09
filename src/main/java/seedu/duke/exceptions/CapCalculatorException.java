package seedu.duke.exceptions;

/**
 * Represents a Capcalculator exception.
 */
public class CapCalculatorException extends Exception {
    private String errorMessage;

    private static final String NEW_LINE = "\n";
    private static final String EXITING_CURRENT_COMMAND = "Exiting current command back to CapCalculator Main Menu.";

    public CapCalculatorException(String errorMessage) {
        String stringToPrint = errorMessage + NEW_LINE + EXITING_CURRENT_COMMAND;
        this.errorMessage = stringToPrint;
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }
}