public class find_a_peak_element_II {
    public static int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // Find the row index of the maximum element in the mid column
            int maxRow = 0;
            for (int i = 1; i < m; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            // 'mid == 0' is used if we are at the first col
            boolean leftIsSmaller = (mid == 0) || (mat[maxRow][mid] > mat[maxRow][mid - 1]);

            // 'mid == n-1' is used if we are the last col.
            boolean rightIsSmaller = (mid == n - 1) || (mat[maxRow][mid] > mat[maxRow][mid + 1]);

            if (leftIsSmaller && rightIsSmaller) {
                return new int[] { maxRow, mid };
            } else if (!leftIsSmaller) {
                end = mid - 1; // Move left
            } else {
                start = mid + 1; // Move right
            }
        }

        return new int[] { -1, -1 }; // Should never be reached
    }

    public static void main(String[] args) {
        int mat[][] = { { 1 }, { 3 }, { 4 } };
        findPeakGrid(mat);

    }
}
