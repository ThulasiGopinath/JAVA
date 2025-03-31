import java.util.Arrays;
public class movenegativestoend {
    public static void main(String[] args) {

        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        int n = arr.length;
        int[] temp = new int[n];
        
        // Temporary array to store rearranged elements
        int j = 0;

        // Store all positive elements first
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[j++] = arr[i];
            }
        }

        // Store all negative elements
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[j++] = arr[i];
            }
        }

        // Copy back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));

    }
}