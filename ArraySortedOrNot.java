public class ArraySortedOrNot {
    public static int sumOfArray(int[] a, int n, int i) {
        if (i >= n) {
            return 0;
        }
        return a[i] + sumOfArray(a, n, i + 1);
    }

    public static boolean checkSorted(int[] a, int n, int i) {
        if (i >= n - 1) {
            return true;
        }
        if (a[i] > a[i + 1]) {
            return false;
        }
        return checkSorted(a, n, i + 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        
        //System.out.println("Sum of Array: " + sumOfArray(a, a.length, 0));
        System.out.println("Is Sorted: " + checkSorted(a, a.length, 0));
    }
}
