package leetcode;

import java.util.*;

public class set_matrix_zeroes {
    // Brute force

    /*
     * // To make only that particular row 0.
     * public static void helperRow(int row, int[][] matrix) {
     * for (int i = 0; i < matrix[row].length; i++) {
     * matrix[row][i] = 0;
     * }
     * }
     * 
     * // To make only that particular col 0.
     * public static void helperCol(int col, int[][] matrix) {
     * for (int i = 0; i < matrix.length; i++) {
     * matrix[i][col] = 0;
     * }
     * }
     * 
     * public static void setZeroes(int[][] matrix) {
     * // To store initial position of zeroes.
     * HashSet<Integer> rows = new HashSet<>();
     * HashSet<Integer> cols = new HashSet<>();
     * 
     * for (int i = 0; i < matrix.length; i++) {
     * for (int j = 0; j < matrix[i].length; j++) {
     * if (matrix[i][j] == 0) {
     * rows.add(i);
     * cols.add(j);
     * }
     * }
     * }
     * 
     * // makes row zero.
     * for (int i : rows) {
     * helperRow(i, matrix);
     * }
     * 
     * // makes col zero.
     * for (int j : cols) {
     * helperCol(j, matrix);
     * }
     * }
     * 
     */

    // A much better approach
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row[] = new int[n];
        int col[] = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(matrix);
    }
}
