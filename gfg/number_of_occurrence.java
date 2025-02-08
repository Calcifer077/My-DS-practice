package gfg;

public class number_of_occurrence {
    public static int search(int arr[], int target, boolean flag) {
        int start = 0;
        int end = arr.length - 1;
        int pos = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                pos = mid;

                if (flag) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return pos;
    }

    public static int countFreq(int[] arr, int target) {
        int left = search(arr, target, true);
        int right = search(arr, target, false);

        if (left == -1 && right == -1) {
            return 0;
        }
        if (left == -1) {
            return 1;
        }
        if (right == -1) {
            return 1;
        }

        return right - left + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 9, 10, 12, 12, 12 };
        int target = 12;

        System.out.println(countFreq(arr, target));
    }

}
