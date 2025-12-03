package P0010;

import java.util.Random;

public class Utility {

    public int[] Randomizer(int size) { // Generate an array of random integers in input size
        int[] arr = new int[size];
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
    public void displayArray(String msg, int[] arr) {
        int size = arr.length;
        System.out.print(msg);
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

    public void displaySearchResults(int target, int[] foundIndices) {
        if (foundIndices.length > 0) {
            System.out.println("Number " + target + " found at indices: ");
            for (int index : foundIndices) {
                System.out.println(index);
            }
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }
}
