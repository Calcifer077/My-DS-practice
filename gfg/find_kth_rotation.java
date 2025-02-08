package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class find_kth_rotation {
    public static int findKRotation(List<Integer> arr) {
        // Rotation will be on the index that have the minimum value
        int index = 0;

        int start = 0;
        int end = arr.size() - 1;
        int min = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr.get(start) <= arr.get(end)) {
                if (arr.get(start) < min) {
                    index = start;
                    min = arr.get(start);
                }

                break;
            }

            if (arr.get(start) < arr.get(mid)) {
                if (arr.get(start) < min) {
                    index = start;
                    min = arr.get(start);
                }

                start = mid + 1;
            } else {
                if (arr.get(mid) < min) {
                    index = mid;
                    min = arr.get(mid);
                }

                end = mid - 1;
            }

        }

        return index;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(38, 40, 43, 44, 4, 9, 12, 21, 32, 34));
        System.out.println(findKRotation(arr));
    }
}
