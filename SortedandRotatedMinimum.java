public class SortedandRotatedMinimum {
    public static void main(String[] args) {

        int[] arr = {4,7,3,2,9};
         // complete the function here
        int start = 0;
        int end = arr.length - 1;

        while(start<end) {
            int mid = (start + end) / 2;

            if(arr[mid] > arr[end]) {
            start = mid + 1;
            } else {
            end = mid;
            }
        }

        System.out.println(arr[start]);

    }
}