public class max_increase_to_keep_city_skyline {
    public static int solve(int[][] arr, int row, int col) {
        int maxRow = Integer.MIN_VALUE;
        int maxCol = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            maxRow = Math.max(maxRow, arr[row][i]);
        }

        for (int i = 0; i < arr.length; i++) {
            maxCol = Math.max(maxCol, arr[i][col]);
        }

        return Math.min(maxRow, maxCol) - arr[row][col];
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        // To make sure that we don't disturbe skyline of the city we have to increase
        // height of each building that it doesn't is not more than the height of
        // buildings horizontally and vertically.
        int res = 0;

        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res += solve(grid, i, j);
            }
        }

        return res;
    }
}
