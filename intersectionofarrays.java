import java.util.*;

class intersectionofarrays {
    public static List<Integer> intersection(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    int flag = 1;
                    for (int k = 0; k < res.size(); k++) {
                        if (nums1[i] == res.get(k)) {
                            flag = 0;
                            break;
                        }
                    }
                    if (flag == 1) {
                        res.add(nums1[i]);
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        List<Integer> result = intersection(nums1, nums2);
        System.out.println(result);
    }
}