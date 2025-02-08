import java.util.HashSet;

public class count_number_of_distinct_integers_after_reverse_operations {
    // For reversing the number
    public static int reverse(int n) {
        long ans = 0;
        while (n > 0) {
            ans *= 10;
            int a = n % 10;
            ans += a;
            n /= 10;
        }

        return (int) ans;
    }

    public static int countDistinctIntegers(int[] nums) {
        // We are using set here as it will only store distinct elements in it.
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
            set.add(reverse(i));
        }

        return set.size();
    }

    public static void main(String[] args) {
        int nums[] = { 1, 13, 10, 12, 31 };
        System.out.println(countDistinctIntegers(nums));
    }
}
