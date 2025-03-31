public class sort012 {

    public static void main(String[] args) {

        int[] arr = {1,0,2,0,1,2,1,0};

        int left = 0, mid = 0, right = arr.length - 1;

        while (mid <= right) {
            if (arr[mid] == 0) {
                swap(arr, left, mid);
                left++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                swap(arr, mid, right);
                right--;
            }
        }

        System.out.println(arr);
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}