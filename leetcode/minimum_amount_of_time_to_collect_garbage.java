public class minimum_amount_of_time_to_collect_garbage {
    public static int calcCost(int[] travel, int max, int n, int arr[]) {
        int res = 0;
        res += arr[0];
        if (arr[0] == max) {
            return res;
        }

        for (int i = 1; i < n; i++) {
            res += travel[i - 1];
            res += (arr[i] - arr[i - 1]);
            if (max == arr[i]) {
                return res;
            }
        }

        return res;
    }

    public static int garbageCollection(String[] garbage, int[] travel) {
        int res = 0;

        int n = garbage.length;
        int m[] = new int[n];
        int g[] = new int[n];
        int p[] = new int[n];

        for (int i = 0; i < garbage[0].length(); i++) {
            if (garbage[0].charAt(i) == 'M') {
                m[0]++;
            } else if (garbage[0].charAt(i) == 'G') {
                g[0]++;
            } else {
                p[0]++;
            }
        }

        for (int i = 1; i < n; i++) {
            String s = garbage[i];
            m[i] = m[i - 1];
            g[i] = g[i - 1];
            p[i] = p[i - 1];
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'M') {
                    m[i]++;
                } else if (s.charAt(j) == 'G') {
                    g[i]++;
                } else {
                    p[i]++;
                }
            }
        }

        res += calcCost(travel, m[n - 1], n, m);
        res += calcCost(travel, p[n - 1], n, p);
        res += calcCost(travel, g[n - 1], n, g);

        return res;
    }

    public static void main(String[] args) {
        String garbage[] = { "G", "P", "GP", "GG" };
        int travel[] = { 2, 4, 3 };
        System.out.println(garbageCollection(garbage, travel));
    }
}