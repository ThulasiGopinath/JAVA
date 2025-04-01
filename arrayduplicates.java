import java.util.*;
class arrayduplicates {
    public static List<Integer> findDuplicates(int[] arr) {
        Arrays.sort(arr); // Sort array
        List<Integer> res = new ArrayList<>();
        boolean foundDuplicate = false; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                if (!foundDuplicate) { 
                    res.add(arr[i]); // Add only once
                }
                foundDuplicate = true;
            } else {
                foundDuplicate = false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 5, 8, 9, 5, 1, 7, 3, 4};

        List<Integer> result = findDuplicates(arr);

        System.out.println(result);
    }
}
