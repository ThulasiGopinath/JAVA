

class BinarySearch {
    public int binarySearch(int[] a, int k) {
        int low = 0, high = a.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (a[mid] == k) {
                return mid; // Element found, return index
            } else if (a[mid] > k) {
                high = mid - 1; // Search in the left half
            } else {
                low = mid + 1; // Search in the right half
            }
        }
        
        return -1; // Element not found
    }
    public static void main(String[] args) {
        BinarySearch sol = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        
        int index = sol.binarySearch(arr, key);
        
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}