// Lights out

import java.util.*;

public class _275A {
    public static void changeMatrix(int mat[][], int i, int j) {
        // the matrix will always be 3 x 3

        // Changing the current cell
        // For all cells only the cell that are side adjacent to them will be changed,
        // not the one that are diagonally connected.
        mat[i][j] = (mat[i][j] == 1) ? 0 : 1;
        // Top right corner
        if (i == 0 && j == 0) {
            mat[i + 1][j] = (mat[i + 1][j] == 1) ? 0 : 1;
            mat[i][j + 1] = (mat[i][j + 1] == 1) ? 0 : 1;

            // Bottom left corner
        } else if (i == 2 && j == 2) {
            mat[i - 1][j] = (mat[i - 1][j] == 1) ? 0 : 1;
            mat[i][j - 1] = (mat[i][j - 1] == 1) ? 0 : 1;

            // bottom right corner
        } else if (i == 0 && j == 2) {
            mat[i + 1][j] = (mat[i + 1][j] == 1) ? 0 : 1;
            mat[i][j - 1] = (mat[i][j - 1] == 1) ? 0 : 1;

            // top right corner
        } else if (i == 2 && j == 0) {
            mat[i - 1][j] = (mat[i - 1][j] == 1) ? 0 : 1;
            mat[i][j + 1] = (mat[i][j + 1] == 1) ? 0 : 1;

            // first row, second column
        } else if (i == 0) {
            mat[i + 1][j] = (mat[i + 1][j] == 1) ? 0 : 1;
            mat[i][j - 1] = (mat[i][j - 1] == 1) ? 0 : 1;
            mat[i][j + 1] = (mat[i][j + 1] == 1) ? 0 : 1;

            // third row, second column
        } else if (i == 2) {
            mat[i - 1][j] = (mat[i - 1][j] == 1) ? 0 : 1;
            mat[i][j - 1] = (mat[i][j - 1] == 1) ? 0 : 1;
            mat[i][j + 1] = (mat[i][j + 1] == 1) ? 0 : 1;

            // first column, second row
        } else if (j == 0) {
            mat[i + 1][j] = (mat[i + 1][j] == 1) ? 0 : 1;
            mat[i - 1][j] = (mat[i - 1][j] == 1) ? 0 : 1;
            mat[i][j + 1] = (mat[i][j + 1] == 1) ? 0 : 1;

            // third column, second row
        } else if (j == 2) {
            mat[i + 1][j] = (mat[i + 1][j] == 1) ? 0 : 1;
            mat[i - 1][j] = (mat[i - 1][j] == 1) ? 0 : 1;
            mat[i][j - 1] = (mat[i][j - 1] == 1) ? 0 : 1;
        } else {

            // Middle cell
            mat[i + 1][j] = (mat[i + 1][j] == 1) ? 0 : 1;
            mat[i - 1][j] = (mat[i - 1][j] == 1) ? 0 : 1;
            mat[i][j - 1] = (mat[i][j - 1] == 1) ? 0 : 1;
            mat[i][j + 1] = (mat[i][j + 1] == 1) ? 0 : 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int mat[][] = new int[n][n];

        // Taking input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Converting all odd numbers to 1 and all even to 0.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = mat[i][j] % 2;
            }
        }

        // Converting a array of 1 denoting all initially turned on.
        int ans[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = 1;
            }
        }

        // Changing only when we have to meaning that light is pressed atleast once.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    changeMatrix(ans, i, j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}