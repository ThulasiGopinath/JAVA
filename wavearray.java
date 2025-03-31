class wavearray {
    public static void convertToWave(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i += 2) { // Increment by 2 to create wave pattern
            swap(arr, i, i + 1);
        }
    }
    
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        convertToWave(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}