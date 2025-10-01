package P0010;

import java.util.Scanner;
import java.util.Random;

public class Utility {
    /**
     * Error message for invalid number format.
     */
    private static final String FORMAT_ERROR = "Invalid format number.";

    /**
     * Error message for out-of-range values.
     */
    private static final String RANGE_ERROR = "Input is out of the allowed range.";

    /**
     * Prompts the user to enter an integer within a specified range [min, max].
     * Continues prompting until a valid integer is entered.
     *
     * @param msg the prompt message to display
     * @param min the minimum acceptable integer (inclusive)
     * @param max the maximum acceptable integer (inclusive)
     * @return an integer within the range [min, max]
     */
    public int getIntInRange(String msg, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        do {
            try {
                System.out.print(msg);
                String input = sc.nextLine();
                if (checkInt(input) != -1) {
                    return checkInt(input);
                }
                result = Integer.parseInt(input);
                if (result < min || result > max) {
                    throw new IllegalArgumentException(RANGE_ERROR);
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(FORMAT_ERROR);
            }
            return result;
        } while (true);
    }

    /**
     * Checks if the input string is a valid integer with a ".0" decimal (e.g.,
     * "5.0").
     *
     * @param input the input string to check
     * @return the integer value if input matches the pattern, otherwise -1
     */
    public int checkInt(String input) {
        if (input.matches("\\d+[\\.][0]+")) {
            return Integer.parseInt(input.substring(0, input.indexOf(".")));
        }
        return -1;
    }

    /**
     * Fills the given array with random integers in the range [0, size-1].
     *
     * @param size the number of elements to fill
     * @param arr  the array to fill with random integers
     * @return the array filled with random integers
     */
    public int[] randomizer(int size, int[] arr) { // Fill the array with random integers
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(size); // Random numbers between 0 and size - 1
        }
        return arr;
    }

    /**
     * Finds all indices of the target value in the given array.
     * Iterates through the array and collects all positions where the element
     * equals the target value.
     *
     * @param target the value to search for in the array
     * @param arr    the array to search
     * @return an array containing all indices where the target is found;
     *         returns an empty array if the target is not found
     */
    public int[] findAllIndices(int target, int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value == target) {
                count++;
            }
        }
        int[] indices = new int[count];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indices[idx++] = i;
            }
        }
        return indices;
    }

    /**
     * Displays the contents of the array in [a, b, c] format.
     *
     * @param arr the array to display
     */
    public void displayArray(int[] arr) {
        int size = arr.length;
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
