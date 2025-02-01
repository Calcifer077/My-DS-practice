
import java.util.*;

public class intersection_of_two_arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if (!map.containsKey(nums1[i]))
                    map.put(nums1[i], 1);

                i++;
                j++;

            }
        }

        int res[] = new int[map.size()];

        int a = 0;
        for (int k : map.keySet()) {
            res[a] = k;
            a++;
        }

        for (int k = 0; k < res.length; k++) {
            System.out.println(res[k]);
        }

        return res;
    }

    public static void main(String[] args) {
        int nums1[] = { 4, 9, 5 };
        int nums2[] = { 9, 4, 9, 8, 4 };
        intersection(nums1, nums2);
    }
}
