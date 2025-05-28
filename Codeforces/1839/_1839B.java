// Lamps

import java.util.*;

public class _1839B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[][] = new int[n][2];

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();

                map.put(arr[i][0], map.getOrDefault(arr[i][0], 0) + 1);
            }

            Arrays.sort(arr, Comparator.comparingDouble(o -> o[1]));

            int turnedOnLamps = 0;
            long res = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (map.get(arr[i][0]) > 0) {
                    turnedOnLamps++;
                    res += arr[i][1];
                }

                if (map.containsKey(turnedOnLamps) && map.get(turnedOnLamps) > 0) {
                    int temp = turnedOnLamps;
                    turnedOnLamps -= map.get(temp);
                    map.put(temp, 0);
                }
            }

            System.out.println(res);

        }
        sc.close();
    }
}