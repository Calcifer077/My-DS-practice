package leetcode;

public class can_place_flowers {

    public static boolean solve(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        if (len == 1 && flowerbed[0] == 0 && n == 1) {
            return true;
        }

        if (len == 2) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0 && n == 1) {
                return true;
            }
        }

        for (int i = 1; i < len - 1; i++) {
            if (i == 1) {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
                    flowerbed[i - 1] = 1;
                    count++;
                }
            }

            if (i == len - 2) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }

            if (flowerbed[i] == 0) {
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        int res = n - count;
        System.out.println(count);
        if (res <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0 };
        int n = 2;
        System.out.println(solve(arr, n));
    }
}
