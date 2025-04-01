class countinversions {
    static int inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    // Merge Sort function with direct merging and counting
    private static int mergeSort(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Count inversions in left and right halves
            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);

            // Merge and count inversions inline
            int i = left, j = mid + 1, k = 0;
            int[] temp = new int[right - left + 1];

            while (i <= mid && j <= right) {
                if (arr[i] <= arr[j]) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                    count += (mid - i + 1); // Count inversions
                }
            }

            // Copy remaining elements
            while (i <= mid) temp[k++] = arr[i++];
            while (j <= right) temp[k++] = arr[j++];

            // Copy back sorted elements to original array
            System.arraycopy(temp, 0, arr, left, temp.length);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println("Inversion Count: " + inversionCount(arr)); // Output: 3
    }
}
