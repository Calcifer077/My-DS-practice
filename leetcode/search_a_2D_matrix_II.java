public class search_a_2D_matrix_II {
    public static boolean searchMatrix(int[][] matrix, int target) {
        // All integers in a row are sorted in ascending order
        // All integers in a col are sorted in ascending order

        // Constraints are 1 <= n, m <= 300

        // Brute force

        /*
         * 
         * int m = matrix.length;
         * int n = matrix[0].length;
         * 
         * for (int i = 0; i < m; i++) {
         * for (int j = 0; j < n; j++) {
         * if (matrix[i][j] == target) {
         * return true;
         * }
         * }
         * }
         * return false;
         */

        // Trying to optimize it
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }

        // Starting from top right corner
        int col = matrix[0].length - 1;
        int row = 0;
        while (col >= 0 && row <= matrix.length - 1) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else if (target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = 5;

        System.out.println(searchMatrix(matrix, target));
    }
}
