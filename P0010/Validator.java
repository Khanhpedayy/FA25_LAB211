package P0010;

import java.util.Scanner;

public class Validator {
    public int getIntInRange(String msg, int min, int max) { // Validate input integer in
                                                             // range
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.println(msg);
            String input = sc.nextLine();
            if (checkInt(input) != -1) {
                return checkInt(input);
            }
            try {
                result = Integer.parseInt(input);
                if (result < min || result > max) {
                    System.err.println(
                            "Input is out of range. Please enter a value between " + min + " and " + max + ".");
                    continue;
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input format. Please enter a valid integer.");
                continue;
            }
        }
    }

    /**
     * Checks if the input string is an integer with a ".0" decimal (e.g., "5.0").
     *
     * @param input the input string to check
     * @return the integer value if input matches the pattern, otherwise -1
     */
    public int checkInt(String input) { // Check if input is an integer
        if (input.matches("\\d+[\\.][0]+")) {
            return Integer.parseInt(input.substring(0, input.indexOf(".")));
        }
        return -1;
    }
}
