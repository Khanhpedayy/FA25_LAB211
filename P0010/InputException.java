package P0010;

/**
 * Custom exception for input validation errors, with reusable error messages.
 */
public class InputException extends RuntimeException {
    public static final String FORMAT_ERROR = "Invalid format number.";
    public static final String RANGE_ERROR = "Invalid number. Number is out of range.";

    public InputException(String message) {
        super(message);
    }
}
