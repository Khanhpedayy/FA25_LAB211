package P0001;

public class main {

    public static void main(String[] args) {
        Util util = new Util();
        int size = util.getIntInRange("Enter number of array: ", 1, Integer.MAX_VALUE);
        int[] arr = util.Randomizer(size);
        util.displayArray("Unsorted array: ", arr);
        util.BubbleSort(arr);
        util.displayArray("Sorted array: ", arr);
    }
}