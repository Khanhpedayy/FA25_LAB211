package P0001;

import java.util.Random;
import java.util.Scanner;

public class Util {
    /**
     * Prompts the user to enter an integer within a specific range.
     * Throws InvalidInputException if the input is not a valid integer or not in
     * range.
     *
     * @param msg the prompt message to display to the user
     * @param min the minimum acceptable integer (inclusive)
     * @param max the maximum acceptable integer (inclusive)
     * @return a valid integer in the range [min, max]
     * @throws InvalidInputException if the input is invalid or out of range
     */
    public int getIntInRange(String msg, int min, int max) throws InvalidInputException { // Validate input integer in
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
                    throw new InvalidInputException(InvalidInputException.RANGE_ERROR);
                }
                return result;
            } catch (NumberFormatException e) {
                throw new InvalidInputException(InvalidInputException.FORMAT_ERROR);
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

    /**
     * Fills the given array with random integers in the range [0, size-1].
     *
     * @param size the number of elements to fill
     * @param arr  the array to fill with random integers
     * @return the array filled with random integers
     */
    public int[] Randomizer(int size, int[] arr) { // Generate an array of random integers in input size
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(size); // Random numbers between 0 and size - 1
        }
        return arr;
    }

    /**
     * Displays the contents of the array in [a, b, c] format.
     *
     * @param arr the array to display
     */
    public void displayArray(int[] arr) { // Display the array
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
    }

    /**
     * Sorts the array in ascending order using Bubble Sort algorithm.
     *
     * @param arr the array to sort
     */
    public void BubbleSort(int[] arr) { // Sort the array using Bubble Sort
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
