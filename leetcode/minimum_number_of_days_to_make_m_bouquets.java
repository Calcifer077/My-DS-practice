public class minimum_number_of_days_to_make_m_bouquets {
    public static boolean numOfBouquets(int[] bloomDay, int m, int k, int n) {
        int num = 0;
        int count = 0;
        // Calculating number of consecutive bouquets for 'n' th day.
        for (int i : bloomDay) {
            // If it has blommed
            if (i <= n) {
                count++;
            } else {
                // Calculate consecutive
                num += (count / k);
                count = 0;
            }
        }

        // If the last one also blommed
        num += (count / k);

        return num >= m;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        // If the number of flowers required are more than what are total number of
        // flowers
        if ((long) m * k > n) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : bloomDay) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }

        int start = min;
        int end = max;

        while (start <= end) {
            int mid = (start + end) / 2;

            // If it is possible for a value we can try to check if it is possible for a
            // value which is smaller than this eliminating right half.
            if (numOfBouquets(bloomDay, m, k, mid)) {
                end = mid - 1;
            } else {
                // It is not possible for mid then it is surely not possible for any value which
                // is smaller than mid so eliminte left half.
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int bloomDay[] = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 2;
        int k = 3;
        System.out.println(minDays(bloomDay, m, k));

        // System.out.println(numOfBouquets(bloomDay, 2, 3, 13));

    }
}
