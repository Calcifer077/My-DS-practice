public class minimum_operations_to_reduce_X_to_zero {
    public static int minOperations(int[] nums, int x) {
        /*
         * 
         * int n = nums.length;
         * 
         * int i = 0;
         * int j = n - 1;
         * 
         * int count = 0;
         * 
         * if (x < nums[0] && x < nums[n - 1]) {
         * System.out.println("1");
         * return -1;
         * }
         * 
         * while (i <= j) {
         * if (nums[i] == x) {
         * x -= nums[i];
         * count++;
         * return count;
         * }
         * 
         * if (nums[j] == x) {
         * x -= nums[j];
         * count++;
         * return count;
         * }
         * 
         * if (nums[i] >= nums[j] && nums[i] <= x) {
         * x -= nums[i];
         * i++;
         * count++;
         * } else if (nums[i] <= nums[j] && nums[j] <= x) {
         * System.out.println(nums[j]);
         * x -= nums[j];
         * j--;
         * count++;
         * } else if (nums[i] <= x) {
         * x -= nums[i];
         * i++;
         * count++;
         * } else if (nums[j] <= x) {
         * x -= nums[j];
         * j--;
         * count++;
         * } else {
         * return -1;
         * }
         * 
         * if (x == 0) {
         * return count;
         * }
         * }
         */

        // Have to find the maximum subarray with totalSum - x
        // We will try to find the maximum subarray of totalSum - x.
        // If it exists then it is the answer other wise return -1.
        int totalSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        // If 'totalSum' itself is less than the sum we have to form.
        if (totalSum < x) {
            return -1;
        }

        int diff = totalSum - x;

        // All the elements will be used.
        if (diff == 0) {
            return n;
        }

        int max = 0;
        int i = 0;
        int j = 0;

        int sum = 0;

        // Finding maximum subarray for a given sum.
        while (j < n) {
            sum += nums[j];
            if (sum == diff) {
                max = Math.max(max, j - i + 1);
            }

            if (sum > diff) {
                while (sum > diff) {
                    sum -= nums[i];
                    i++;
                }

                if (sum == diff) {
                    max = Math.max(max, j - i + 1);
                }
            }
            j++;
        }

        if (max == 0) {
            return -1;
        } else {
            return n - max;
        }

    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 4, 2, 3 };
        int x = 5;
        System.out.println(minOperations(nums, x));
    }
}
