package gfg;

public class square_root {
    public static int floorSqrt(int n) {
        // Approach 1
        // return (int) Math.sqrt(n);

        // Approach 2
        // without using inbuilt function
        // if(n == 1){
        // return 1;
        // }

        // int pos = -1;
        // for (int i = 1; i <= n / 2; i++) {
        // if (i * i <= n) {
        // pos = i;
        // continue;
        // } else {
        // break;
        // }
        // }
        // return pos;

        // Approach 3
        if (n == 1) {
            return 1;
        }
        int pos = 1;

        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = (start + end) / 2;
            long m = mid * mid;
            if (m <= n) {
                pos = Math.max(mid, pos);
            }

            if (m > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return pos;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(floorSqrt(n));
    }
}
