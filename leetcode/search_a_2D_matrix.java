package leetcode;

public class search_a_2D_matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        // Every cell is sorted.
        // Cell which comes first from (0,0) will always be less than the one that come
        // beside it.
        // Have to sovle in O(log(m * n))

        // Can use binary search.
        // Can create our own array by traversing through each element but it will take
        // O(m * n).

        // Need to reduce it.

        /*
         * 
         * int m = matrix.length;
         * int n = matrix[0].length;
         * int start = 0;
         * int end = m * n - 1;
         */

        // The idea is still trying to use a array.
        // What we are doing is if the element were to form a array then where would the
        // matrix element come. We try to find that without actually creating a array.

        /*
         * 
         * while (start <= end) {
         * int mid = start + (end - start) / 2;
         * int row = mid / n;
         * int col = mid - (row * n);
         * 
         * if (matrix[row][col] == target) {
         * return true;
         * }
         * 
         * if (matrix[row][col] > target) {
         * end = mid - 1;
         * } else {
         * start = mid + 1;
         * }
         * }
         * 
         * return false;
         */

        // A Much better approach.

        // In the below approach we move accross columns and rows.
        // We start from the last column of the first row.
        // If target is more than matrix[row][col] then it means that it is in the next
        // row so increament row, else it is in the same row but some col down so
        // decrement col.

        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
}
