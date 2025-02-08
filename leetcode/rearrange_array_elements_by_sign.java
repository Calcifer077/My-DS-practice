import java.util.ArrayList;

public class rearrange_array_elements_by_sign {
    // Below will work if both the number of positive and negative elements are
    // equal.

    /*
     * public static int[] rearrangeArray(int[] nums) {
     * int res[] = new int[nums.length];
     * 
     * int pos = 0;
     * int neg = 0;
     * int curr = 0;
     * 
     * while (pos < nums.length && neg < nums.length) {
     * // Find the next positive element
     * while (nums[pos] < 0 && pos < nums.length) {
     * pos++;
     * }
     * 
     * // After inserting it into the 'res' array increment both 'curr' and 'pos'.
     * res[curr] = nums[pos];
     * curr++;
     * pos++;
     * 
     * // Find the next negative element
     * while (nums[neg] > 0 && neg < nums.length) {
     * neg++;
     * }
     * 
     * // After inserting it into 'res' array increment both 'curr' and 'res'.
     * res[curr] = nums[neg];
     * curr++;
     * neg++;
     * }
     * 
     * return res;
     * }
     */

    // If number of positive and negative are diffrenet in numbers.
    public static int[] rearrangeArray(int[] nums) {
        int res[] = new int[nums.length];

        // Creating two arraylist for positive and negative numbers.
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Adding numbers according to their signs.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }

        // If we have more positives than negatives, it means that positive number will
        // come at last.
        if (pos.size() >= neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                // Adding positive at even position as result array should start with positive
                // number.
                res[2 * i] = pos.get(i);
                // Adding negative at odd position.
                res[2 * i + 1] = neg.get(i);
            }

            // This is the index where next element will come.
            int index = neg.size() * 2;

            // We are starting from 'neg.size' because this many positive numbers are alredy
            // inserted in result array.
            for (int i = neg.size(); i < pos.size(); i++) {
                res[index] = pos.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                res[2 * i] = pos.get(i);
                res[2 * i + 1] = neg.get(i);
            }

            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                res[index] = neg.get(i);
                index++;
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

        return res;
    }

    public static void main(String[] args) {
        // int nums[] = { 3, 1, -2, -5, 2, -4 };
        int nums[] = { 1, 2, -4, -5, 3, 4 };
        rearrangeArray(nums);
    }
}
