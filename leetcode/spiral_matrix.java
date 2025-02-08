
import java.util.*;

public class spiral_matrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m - 1;
        int right = n - 1;
        int left = 0;

        int count = 0;
        while (count < matrix.length * matrix[0].length) {
            // left to right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
                count++;
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
                count++;
            }
            right--;

            // right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                    count++;
                }
                bottom--;
            }

            // bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                    count++;
                }
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(spiralOrder(matrix));
    }
}
