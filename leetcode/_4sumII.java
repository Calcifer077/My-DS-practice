import java.util.*;

public class _4sumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        int n = nums1.length;

        // Trying to create pairs.
        // pair1 nums1, nums2
        // pair2 nums3, nums4
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = nums1[i] + nums2[j];
                map1.put(a, map1.getOrDefault(a, 0) + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = nums3[i] + nums4[j];
                if (map1.containsKey(-a)) {
                    // As there can be more than one occurance
                    res += map1.get(-a);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
