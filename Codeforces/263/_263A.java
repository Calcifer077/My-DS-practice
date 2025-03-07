// Beautiful matrix

import java.util.*;

public class _263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 5;
        int col = 5;

        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int posR = -1;
        int posC = -1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) {
                    posR = i;
                    posC = j;
                }
            }
        }

        System.out.println(Math.abs(3 - (posR + 1)) + Math.abs(3 - (posC + 1)));
        sc.close();
    }
}