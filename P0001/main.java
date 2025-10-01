package P0001;

public class main {

    public static void main(String[] args) {
        Util util = new Util();
        int size = 0;
        while (true) {
            try {
                size = util.getIntInRange("Enter number of array: ", 1, Integer.MAX_VALUE);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        int arr[] = new int[size];
        util.Randomizer(size, arr);
        System.out.println("Unsorted array: ");
        util.displayArray(arr);
        util.BubbleSort(arr);
        System.out.println("\nSorted array: ");
        util.displayArray(arr);
    }
}