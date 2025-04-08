import java.util.Arrays;
public class Ceilthefloor {
    public static void main(String[] args) {
        // Your Code goes here!
        int [] arr = {4,7,9,5,6};
        int x = 8;

        Arrays.sort(arr);

        int floor = findfloor(arr, x);
        int ceil = findceil(arr, x);

        System.out.println("Floor = " +floor);
        System.out.println("ceil = " +ceil);

    }
    private static int findfloor(int[] arr, int x){
        int i = 0, j = arr.length - 1;

        if (arr[0] > x) return -1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] > x) j = mid - 1;
            else i = mid + 1;
        }

        return arr[j];
    }
    private static int findceil(int[] arr, int x){
        int i = 0, j = arr.length - 1;

        if (arr[arr.length - 1] < x) return -1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == x) return arr[mid];
            else if (arr[mid] > x) j = mid - 1;
            else i = mid + 1;
        }

        return arr[i];
    }

}
