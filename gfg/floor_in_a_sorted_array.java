package gfg;

public class floor_in_a_sorted_array {
    public static int findFloor(int arr[], int k) {
        int start = 0;
        int end = arr.length - 1;

        int res = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= k) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 11, 12, 19 };
        System.out.println(findFloor(arr, 0));
    }
}
