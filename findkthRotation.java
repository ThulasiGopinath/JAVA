class FindKthRotation {
    public int findKthRotation(int[] a) {
        int x = -1;

        for (int i = 0; i < a.length - 1; i++) { // Use a.length instead of a.size()
            if (a[i] > a[i + 1]) { // Use array indexing instead of get()
                x = i;
                break;
            }
        }
        return (x != -1) ? x + 1 : 0;
    }

    public static void main(String[] args) {
        int[] a = {6, 1, 2, 3, 4}; // Example input
        FindKthRotation obj = new FindKthRotation();
        int result = obj.findKRotation(a);
        System.out.println("Rotation Count: " + result);
    }
}
