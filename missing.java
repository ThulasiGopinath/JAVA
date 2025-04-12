import java.util.Arrays;
public class missing {

    public static void main(String[] args) {

        int [] a = {1,2,4,5};
        int n = a.length; // Find array size, which is 'n-1' but we need the actual 'n'

        // Sort the array so that numbers are in order
        Arrays.sort(a);

        // i = 0 (start), j = n-1 (end of array)
        int i = 0, j = n - 1;

        // Binary search logic
        while (i < j) {

        int mid = (i + j) / 2; // Mid index
        // Check if mid element is equal to its expected value (mid + 1)
        if (a[mid] == mid + 1) {
            i = mid + 1; // Missing number is after mid, so search the right part
        } else {
            j = mid; // Missing number is before mid, so search the left part
        }
        }

        // After binary search, check the last condition
        if (j + 1 == a[n - 1]) {
        System.out.println(n + 1); // If the last element is expected, then missing is 'n+1'
        }

        System.out.println(j + 1); // Else return the position where missing number is found
    }
}