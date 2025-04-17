package gfg;

import java.util.*;

public class fractional_knapsack {
    public static double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        // Find val is to weight ratio
        // Take a 2D array
        int size = val.size();
        double[][] arr = new double[size][3];

        for (int i = 0; i < size; i++) {
            arr[i][0] = val.get(i);
            arr[i][1] = wt.get(i);

            double ratio = (double) arr[i][0] / (double) arr[i][1];
            arr[i][2] = ratio;
        }

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));

        double res = 0;
        int i = size - 1;
        while (capacity > 0 && i >= 0) {
            if (capacity >= arr[i][1]) {
                capacity -= arr[i][1];
                res += arr[i][0];
            } else {
                res += capacity * arr[i][2];
                capacity = 0;
            }
            i--;
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
