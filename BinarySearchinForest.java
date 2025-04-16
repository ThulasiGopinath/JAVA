//GfG - Binary Search in Forest
public class BinarySearchinForest {

    public static void main(String[] args) {
        int[] tree = {2, 3, 6, 2, 4};
        int n = 5, k = 4;

        int result = find_height(tree, n, k);
        if (result != -1) {
            System.out.println("Cut the trees at height: " + result);
        } else {
            System.out.println("No height found to get exactly " + k + " woods.");
        }
    }

    public static int find_height(int[] tree, int n, int k) {
        int low = 0, high = tree[0];

        // Find max height
        for (int i = 0; i < n; i++) {
            high = Math.max(high, tree[i]);
        }

        // Binary Search
        while (low <= high) {
            int mid = (low + high) / 2;
            int wood = checkheight(tree, n, mid);

            if (wood == k) {
                return mid;
            } else if (wood < k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static int checkheight(int[] tree, int n, int h) {
        int wood = 0;
        for (int i = 0; i < n; i++) {
            if (tree[i] > h) {
                wood += tree[i] - h;
            }
        }
        return wood;
    }
}
