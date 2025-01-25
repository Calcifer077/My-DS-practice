package leetcode;

public class reshape_the_matrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        // Approach I

        /*
         * 
         * if (mat.length * mat[0].length != r * c) {
         * return mat;
         * }
         * 
         * int arr[] = new int[r * c];
         * int count = 0;
         * 
         * for (int i = 0; i < mat.length; i++) {
         * for (int j = 0; j < mat[0].length; j++) {
         * arr[count] = mat[i][j];
         * count++;
         * }
         * }
         * 
         * int res[][] = new int[r][c];
         * 
         * count = 0;
         * for (int i = 0; i < r; i++) {
         * for (int j = 0; j < c; j++) {
         * res[i][j] = arr[count];
         * count++;
         * }
         * }
         * return res;
         * 
         */

        // Approach II
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }

        int res[][] = new int[r][c];

        int k = 0;
        int l = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = mat[k][l];

                l++;

                if (l == mat[0].length) {
                    k++;
                    l = 0;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
