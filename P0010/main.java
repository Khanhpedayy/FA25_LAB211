package P0010;

public class main {

    public static void main(String[] args) {
        Utility util = new Utility();
        Validator valid = new Validator();
        // Step 1: Get the size of the array from the user
        int size = valid.getIntInRange("Enter the size of array:", 1, Integer.MAX_VALUE);
        // Step 2: Generate a random array of the given size
        int[] arr = util.Randomizer(size);
        // Step 3: Display the generated array
        util.displayArray("The array: ", arr);
        // Step 4: Get the target number to search for
        int target = valid.getIntInRange("Enter the number to search:", 0, size - 1);
        // Step 5: Perform linear search to find the target
        int[] foundIndices = util.findAllIndices(target, arr);
        // Step 6: Display the search results
        util.displaySearchResults(target, foundIndices);
    }
}