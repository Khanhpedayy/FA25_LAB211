package P0001;

/**
 * Custom exception for input validation errors, with reusable error messages.
 */
public class InvalidInputException extends Exception {
    public static final String FORMAT_ERROR = "Invalid format number.";
    public static final String RANGE_ERROR = "Invalid number. Number must be between the specified range.";

    public InvalidInputException(String message) {
        super(message);
    }
}
