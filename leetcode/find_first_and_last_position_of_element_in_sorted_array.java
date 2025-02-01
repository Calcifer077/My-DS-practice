
public class find_first_and_last_position_of_element_in_sorted_array {
    public static int search(int nums[], int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    // have to solve in logn. We are given a sorted array so we can do this with
    // binary search
    public static int[] searchRange(int[] nums, int target) {
        int a = search(nums, 0, nums.length - 1, target);
        int b = search(nums, a + 1, nums.length - 1, target);
        int c = search(nums, 0, a - 1, target);

        if (b == -1) {
            return new int[] { c, a };
        } else if (c == -1) {
            return new int[] { a, b };
        } else if (b != -1 && c != -1) {
            return new int[] { c, b };
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        System.out.println(searchRange(nums, 8));
    }
}
