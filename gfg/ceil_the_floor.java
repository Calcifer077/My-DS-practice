package gfg;

public class ceil_the_floor {
    public static int[] getFloorAndCeil(int x, int[] arr) {
        int res[] = new int[2];

        int currMin = Integer.MAX_VALUE;
        int currMax = Integer.MAX_VALUE;

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                res[0] = x;
                res[1] = x;
                break;
            }
            if (arr[i] < x) {
                // if(arr[i])
                if (Math.abs(x - arr[i]) < currMin) {
                    currMin = Math.abs(x - arr[i]);
                    res[0] = arr[i];
                }
            } else if (arr[i] > x) {
                if (Math.abs(x - arr[i]) < currMax) {
                    currMax = Math.abs(x - arr[i]);
                    res[1] = arr[i];
                }
            }
        }

        if (currMin == Integer.MAX_VALUE) {
            res[0] = -1;
        }
        if (currMax == Integer.MAX_VALUE) {
            res[1] = -1;
        }

        System.out.println(res[0] + " " + res[1]);
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 8, 8, 6, 5, 5, 6 };
        int x = 7;

        getFloorAndCeil(x, arr);
    }
}
