public class remove_duplicates_from_sorted_array_II {
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count <= 2) {
                    nums[k] = nums[i];
                    k++;
                }
            } else {
                count = 1;
                nums[k] = nums[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
        return k;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 1, 2, 2, 3 };
        removeDuplicates(nums);
    }
}
