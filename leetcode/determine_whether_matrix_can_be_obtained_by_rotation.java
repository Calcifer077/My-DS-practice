package leetcode;

public class determine_whether_matrix_can_be_obtained_by_rotation {
    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i >= j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                int temp = matrix[i][matrix[0].length - j - 1];
                matrix[i][matrix[0].length - j - 1] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int count = 0;

        int total = mat.length * mat[0].length;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == target[i][j]) {
                    count++;
                }
            }
        }

        if (count == total) {
            return true;
        }

        int k = 0;
        while (k < 4) {
            rotate(mat);
            total = mat.length * mat[0].length;
            count = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] == target[i][j]) {
                        count++;
                    }
                }
            }

            if (count == total) {
                return true;
            }
            k++;
        }

        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 0, 1 }, { 1, 0 } };
        int target[][] = { { 1, 0 }, { 0, 1 } };
        System.out.println(findRotation(matrix, target));
    }
}
