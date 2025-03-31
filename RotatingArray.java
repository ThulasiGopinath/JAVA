public class RotatingArray {
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 1, 2};
        int n = a.length, j = 0;
        int k = 2; // Fix: Declare k

        int[] b = new int[k]; // Fix: Initialize array with correct size

        for (int i = 0; i < k; i++) { // Fix: Store first k elements
            b[i] = a[i];
        }

        for (int i = k; i < n; i++) { // Fix: Shift elements left
            a[i - k] = a[i];
        }

        j = 0; // Fix: Reset j to 0 for correct indexing
        for (int i = n - k; i < n; i++) { // Fix: Place stored elements at the end
            a[i] = b[j];
            j++;
        }

        System.out.print("Rotated Array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
