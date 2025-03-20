public class minimum_time_to_repair_cars {
    public static boolean canYouRepair(int[] ranks, int cars, long time) {
        long carsDone = 0;

        for (int r : ranks) {
            // To find total number of cars that can be repaired within a certain limit
            // We are given r * n * n is the amount of time one takes to repair 'n' cars
            // To find n -> n = Math.sqrt(time taken to repair / r);
            long a = time / r;
            long b = (long) Math.sqrt(a);
            carsDone += b;
        }

        // If we can repair atleast the amount that is asked in the question.
        return carsDone >= cars;
    }

    public static long repairCars(int[] ranks, int cars) {
        // Applying binary search on all the contraints.
        long start = 1;
        long end = (long) 1e14;

        while (start < end) {
            long mid = (start + end) / 2;
            // If we can repair in 'mid' amount of time then we can even try to go for even
            // less, so discarding right half.
            if (canYouRepair(ranks, cars, mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
