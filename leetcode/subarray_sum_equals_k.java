package leetcode;

import java.util.HashMap;

public class subarray_sum_equals_k {
    // We can solve the below question using prefix sum concept.
    // How it will work. We have to check if at any point with sum 's', in our
    // prefix we have 's' - 'k'. It will mean that our subarray contains required
    // subarray.
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int res = 0;

        // Key is 'prefix[]', and value is number of times that prefix[] has come
        // before.
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefix[] = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            // If the total sum upto the current poitn is equal to k.
            if (prefix[i] == k) {
                res++;
            }

            // If our map has 'prefix[i] - k', meaning that by removing this part from the
            // subarray we can have our sum that is 'k'. Now the value will tell how many
            // time we can remove it.
            // Suppose our array is [1,2,3,-3,1,1,1], k = 3.
            // Upto the last index sum is 6. Now we have to check if there exists sum - k
            // that is 3, in our array, we have two such instances. 1,2,3,-3 and 3,-3.
            // If you take subarray 1,2,3,-3,1,1,1 we get desired result.
            // and if we take subarray 3,-3,1,1,1 we get desired result.
            if (map.containsKey(prefix[i] - k)) {
                res += map.get(prefix[i] - k);
            }

            // getOrDefault says that if current key doesn't exists initialize it with 0.
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 1 };
        System.out.println(subarraySum(nums, 1));
    }
}
