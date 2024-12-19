package leetcode;

public class merge_sorted_arrays {
    public static void merge(int nums1[], int m, int nums2[], int n) {
        int end = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;

        while (end >= 0 && i >= 0 && j >= 0) {
            if (nums1[i] <= nums2[j]) {
                nums1[end] = nums2[j];
                j--;
                end--;
            } else if (nums1[i] > nums2[j]) {
                nums1[end] = nums1[i];
                i--;
                end--;
            }
        }

        while (j >= 0) {
            nums1[end] = nums2[j];
            j--;
            end--;
        }

        for (int k = 0; k < nums1.length; k++) {
            System.out.println(nums1[k]);
        }
    }

    public static void main(String[] args) {

        int nums1[] = { -1, 0, 0, 3, 3, 3, 0, 0, 0 };
        int nums2[] = { 1, 2, 2 };
        // int nums1[] = { 1, 2, 4, 0, 0, 0 };
        // int nums2[] = { 2, 5, 6 };
        int m = 6;
        int n = 3;

        merge(nums1, m, nums2, n);
    }
}
