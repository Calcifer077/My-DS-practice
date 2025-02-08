public class product_of_array_except_self {
    public static int[] productExceptSelf(int[] nums) {
        // How to solve it?
        // Take pre and post product arrays for each element of nums.
        // For each element take the product of the right elements and left elements
        // except self.

        int n = nums.length;
        int ans[] = new int[n];
        if (n == 1) {
            return ans;
        }

        int pre[] = new int[n];
        int pos[] = new int[n];
        pre[0] = nums[0];
        pos[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i];
        }

        for (int i = n - 2; i >= 0; i--) {
            pos[i] = pos[i + 1] * nums[i];
        }

        ans[0] = pos[1];
        ans[n - 1] = pre[n - 2];
        for (int i = 1; i < n - 1; i++) {
            ans[i] = pre[i - 1] * pos[i + 1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        productExceptSelf(arr);
    }
}
