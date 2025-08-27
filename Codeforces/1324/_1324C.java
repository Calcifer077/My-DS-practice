// Frog Jumps

import java.util.*;

public class _1324C {
    public static boolean solve(String s, int dist) {
        int n = s.length();
        boolean visited[] = new boolean[n + 2];

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;

        int i = 0;
        for (i = 1; i <= Math.min(0 + dist, n + 1); i++) {
            if (!visited[i]) {
                visited[i] = true;
                q.add(i);
            }
        }
        int target = n + 1;

        // Track farthest explored positions
        int farRight = 0, farLeft = 0;

        while (!q.isEmpty()) {
            int pos = q.poll();

            if (pos == target)
                return true;

            if (pos > 0 && pos <= n) {
                char c = s.charAt(pos - 1);

                if (c == 'R') {
                    // explore [pos+1 .. pos+dist], but only new ones
                    int start = Math.max(farRight + 1, pos + 1);
                    int end = Math.min(pos + dist, target);
                    for (int newPos = start; newPos <= end; newPos++) {
                        if (!visited[newPos]) {
                            visited[newPos] = true;
                            q.add(newPos);
                        }
                    }
                    farRight = Math.max(farRight, end);
                } else { // 'L'
                    // explore [pos-dist .. pos-1], but only new ones
                    int start = Math.min(farLeft - 1, pos - 1);
                    int end = Math.max(pos - dist, 0);
                    for (int newPos = start; newPos >= end; newPos--) {
                        if (!visited[newPos]) {
                            visited[newPos] = true;
                            q.add(newPos);
                        }
                    }
                    farLeft = Math.min(farLeft, end);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Mixed BFS and Binary search
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            int start = 0, end = s.length() + 1, minJump = Integer.MAX_VALUE;
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (solve(s, mid)) {
                    end = mid - 1;
                    minJump = Math.min(minJump, mid);
                } else {
                    start = mid + 1;
                }
            }

            System.out.println(minJump);

            // System.out.println(solve(s, 4));
        }
        sc.close();
    }
}