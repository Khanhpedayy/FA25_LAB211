package P0010;

public class main {
    public static void main(String[] args) {
        Utility util = new Utility();
        int size = 0;
        while (true) {
            try {
                size = util.getIntInRange("Enter number of elements in the array: ", 1, Integer.MAX_VALUE);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        int target = 0;
        while (true) {
            try {
                target = util.getIntInRange("Enter the number to search for: ", 0, Integer.MAX_VALUE);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        int[] arr = new int[size];
        util.randomizer(size, arr);
        System.out.println("The array: ");
        util.displayArray(arr);
        int[] found = util.findAllIndices(target, arr);
        if (found.length > 0) {
            System.out.println("Number " + target + " found at indices: ");
            for (int index : found) {
                System.out.println(index + " ");
            }
            System.out.println();
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }

}