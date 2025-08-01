package gfg;

import java.util.*;

public class rat_in_a_maze {
    public static boolean isAllowed(int i, int j, char dir, int maze[][], int n) {
        if (dir == 'U') {
            if (i > 0 && maze[i - 1][j] != 0) {
                return true;
            }
        }

        if (dir == 'D') {
            if (i < n - 1 && maze[i + 1][j] != 0) {
                return true;
            }
        }

        if (dir == 'L') {
            if (j > 0 && maze[i][j - 1] != 0) {
                return true;
            }
        }

        if (dir == 'R') {
            if (j < n - 1 && maze[i][j + 1] != 0) {
                return true;
            }
        }

        return false;
    }

    public static void solve(int maze[][], int n, int i, int j, ArrayList<String> res, StringBuilder sb) {
        if (maze[i][j] == 0) {
            return;
        }

        if (i > n - 1 && j > n - 1) {
            return;
        }

        if (i == n - 1 && j == n - 1) {
            res.add(sb.toString());
            return;
        }

        // So, that the mouse doesn't come back to this place.
        int a = maze[i][j];
        maze[i][j] = 0;

        // Try to go DOWN 'D'
        if (isAllowed(i, j, 'D', maze, n)) {
            sb.append('D');
            solve(maze, n, i + 1, j, res, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        // Try to go LEFT 'L'
        if (isAllowed(i, j, 'L', maze, n)) {
            sb.append('L');
            solve(maze, n, i, j - 1, res, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        // Try to go RIGHT 'R'
        if (isAllowed(i, j, 'R', maze, n)) {
            sb.append('R');
            solve(maze, n, i, j + 1, res, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        // Try to go UP 'U'
        if (isAllowed(i, j, 'U', maze, n)) {
            sb.append('U');
            solve(maze, n, i - 1, j, res, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        maze[i][j] = a;
    }

    public static ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> res = new ArrayList<>();

        int n = maze.length;

        solve(maze, n, 0, 0, res, new StringBuilder());

        return res;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };

        System.out.println(ratInMaze(mat));
    }
}
