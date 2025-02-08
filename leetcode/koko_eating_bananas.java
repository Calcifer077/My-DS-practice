public class koko_eating_bananas {
    public static long findCost(int nums[], int n) {
        long sum = 0;
        for (int i : nums) {
            sum += (long) Math.ceil((double) i / n);
        }

        return sum;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        // Koko can take a maximum of piles.length time to eat all the bananas and that
        // will happen when k is equal to the max of piles.
        // And the most she can take will be equal to when k == 1
        // Now we have to find the smallest integer such that time taken is less than
        // 'h'
        // We know upper and lower bound so we will apply binary search to reduce search
        // space.

        // To find upper boud
        for (int i : piles) {
            max = Math.max(i, max);
        }

        int start = 1;
        int end = max;

        int res = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long time = findCost(piles, mid);

            // Only consider when 'time' is less than 'h', then take its minimum.
            if (time <= h) {
                res = Math.min(mid, res);
            }

            // If time is less than 'h' then we can take even a smaller integer to increase
            // 'time' just so it stays below 'h'
            if (time <= h) {
                end = mid - 1;
            } else {
                // If 'time' is more than 'h' then we need to increase the speed 'k'.
                start = mid + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int piles[] = { 30, 11, 23, 4, 20 };
        int h = 6;
        System.out.println(minEatingSpeed(piles, h));
        // System.out.println(findCost(piles, 22));

        // 4 30
    }
}

// 4 8 10
// 11 3
//