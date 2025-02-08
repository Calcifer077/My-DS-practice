public class capacity_to_ship_packages_within_d_days {
    // Below function is used to calculate the total number of days that will take
    // to ship the packages with a given capacity(n).
    public static int shippingDays(int[] weights, int n) {
        int res = 0;

        long sum = 0;
        int size = weights.length;

        int i = 0;
        while (i < size) {
            // If weight of a package is more than capacity, then we simply can't ship it.
            if (weights[i] > n) {
                return -1;
            }

            sum += weights[i];

            // This much can be shipped together.
            if (sum == n) {
                res++;
                sum = 0;
            }

            i++;
            if (sum > n) {
                res++;
                sum = 0;
                // To remove the excess weight as we can't cut objects into parts.
                i--;
            }
        }

        // If we still have some value in 'sum'
        if (sum != 0) {
            res++;
        }

        return res;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        // Finding range.
        for (int i : weights) {
            max = Math.max(i, max);
            sum += i;
        }

        // To ship packages we need atleast the maximum value of packages and at most
        // the total sum of packages.
        int start = max;
        int end = sum;
        while (start <= end) {
            int mid = (start + end) / 2;
            int a = shippingDays(weights, mid);

            // If we can ship it,
            if (a != -1) {
                // If we can ship it and 'a' is less than 'days' then we can go for even a
                // smaller conveyor belt, excluding the left half.
                if (a <= days) {
                    end = mid - 1;
                } else {
                    // We need bigger capacity, so we exclude the left half.
                    start = mid + 1;
                }
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int weights[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
        // System.out.println(shippingDays(weights, 13));
    }
}
