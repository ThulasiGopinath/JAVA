public class ArrayTraverse {

    public static void arrayTraverse(int[] a, int n, int i) {
        if (i >= n) {
            return;
        }
        System.out.println(a[i]);  // Print the current element
        arrayTraverse(a, n, i + 1); // Recursive call for the next index
    }

    public static void main(String[] args) {
        int[] a = {3, 567, 5, 6, 879}; // Define the array
        arrayTraverse(a, 5, 0); // Call the recursive function
    }
}
