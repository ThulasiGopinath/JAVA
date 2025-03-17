public class ArrayLinearSearch {

    public static int arrayTraverse(int[] a, int n, int i, int target) {
        if (i >= n) {
            return -1; // Return -1 if the target is not found
        }
        if (a[i] == target) {
            return i; // Return index if the target is found
        }
        return arrayTraverse(a, n, i + 1, target); // Recursive call for next index
    }

    public static void main(String[] args) {
        int[] a = {3, 567, 5, 6, 879}; // Define the array
        int target = 5; // Target element to search
        int index = arrayTraverse(a, a.length, 0, target); // Call the function

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found.");
        }
    }
}
