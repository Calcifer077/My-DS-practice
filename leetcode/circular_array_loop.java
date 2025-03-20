import java.util.HashSet;

public class circular_array_loop {
    public static boolean check(int[] nums, int pos) {
        HashSet<Integer> set = new HashSet<>();
        boolean posDir = nums[pos] >= 0;

        int count = 0;
        int n = nums.length;

        int i = pos;
        // Only check 'n' number of times so that we have a stopping point.
        while (count <= n) {
            // If 'set' cotains 'pos' meaning we went through the array and come back to the
            // initial point again.
            if (set.contains(pos) && set.size() > 1) {
                return true;
            }

            // So that we stay in the array itself.
            i = (i + nums[i]) % n;

            // If we go to a negative index
            if (i < 0) {
                i += n;
            }

            // If there is a change in direction
            if (posDir && nums[i] < 0)
                return false;
            if (!posDir && nums[i] >= 0)
                return false;

            set.add(i);
            count++;
        }

        return false;
    }

    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (check(nums, i))
                return true;
        }
        return false;
    }
}
