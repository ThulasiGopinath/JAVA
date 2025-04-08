import java.util.*;

public class firstandlastoccurrence {

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;

        ArrayList<Integer> result = find(arr, x);
        System.out.println(result); // Output: [2, 5]
    }

    // Method to find first and last occurrence
    public static ArrayList<Integer> find(int arr[], int x) {
        int first = findOccurrence(arr, x, true);
        int last = findOccurrence(arr, x, false);

        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(last);
        return result;
    }

    // Helper method to perform binary search
    public static int findOccurrence(int arr[], int x, boolean first) {
        int i = 0, j = arr.length - 1, ans = -1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == x) {
                ans = mid;
                if (first) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else if (arr[mid] > x) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return ans;
    }
}
