package gfg;

import java.util.*;

public class coins_change {
    public static int minCoins(int coins[], int sum) {
        Arrays.sort(coins);

        int res = 0;
        int i = coins.length - 1;
        while (sum > 0 && i >= 0) {
            if (sum >= coins[i]) {
                int temp = sum;
                sum -= (temp / coins[i]) * coins[i];
                res += temp / coins[i];
            } else {
                i--;
            }
        }

        if (sum == 0) {
            return res;
        }
        return -1;
    }
}
