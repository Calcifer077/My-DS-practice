import java.util.Arrays;

public class sort_the_matrix_diagonally {
    public static int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        if (m == 1 || n == 1) {
            return mat;
        }

        int res[][] = new int[m][n];

        int row = 0;
        int col = 0;

        boolean flag = false;

        // What i have done is:
        // First traverse the matrix that is above the mid diagnoal including that.
        // Then we will traverse the one that is below that diagnol
        // We will increment row in the second pass that's why we will break when 'row'
        // becomes m
        while (row < m) {
            if (!flag) {
                int i = 0;
                int j = col;

                int k = 0;

                // Calculating arr length that will store the result
                int diagLength = Math.min(m - i, n - j);
                int ans[] = new int[diagLength];

                while (i < m && j < n) {
                    ans[k++] = mat[i][j];
                    // Traversing diagnoally
                    i++;
                    j++;
                }

                Arrays.sort(ans);

                i = 0;
                j = col;
                k = 0;

                while (i < m && j < n) {
                    res[i][j] = ans[k++];
                    i++;
                    j++;
                }

                col++;
                // If we have traversed all the way. Start for the matrix diagonally that is
                // below the mid diagnoal
                if (col == n) {
                    row = 1;
                    col = 0;
                    flag = true;
                }
            } else {
                int i = row;
                int j = 0;

                int k = 0;
                int diagLength = Math.min(m - i, n - j);
                int ans[] = new int[diagLength];

                while (i < m && j < n) {
                    ans[k++] = mat[i][j];
                    i++;
                    j++;
                }

                Arrays.sort(ans);

                i = row;
                j = 0;
                k = 0;

                while (i < m && j < n) {
                    res[i][j] = ans[k++];
                    i++;
                    j++;
                }

                row++;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        int mat[][] = { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } };
        diagonalSort(mat);
    }
}
