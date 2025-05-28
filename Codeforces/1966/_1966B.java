// Rectangle Filling

import java.util.*;

public class _1966B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String[] s = new String[n];

            for (int i = 0; i < n; i++) {
                s[i] = sc.next();
            }

            // We have to somehow match colors at diagnols.

            boolean flag = false;
            // CASE I -> TOP LEFT and BOTTOM RIGHT
            if (s[0].charAt(0) == s[n - 1].charAt(m - 1)) {
                flag = true;
            }

            if (!flag) {
                // Try to match with last character of the last row
                char c = s[n - 1].charAt(m - 1);

                // Search in first row for 'c'
                char first[] = s[0].toCharArray();
                boolean a = false;
                for (int i = 0; i < first.length; i++) {
                    if (first[i] == c) {
                        a = true;
                        break;
                    }
                }

                if (a) {
                    // Check first col
                    for (int i = 0; i < n; i++) {
                        if (s[i].charAt(0) == c) {
                            flag = true;
                            break;
                        }
                    }
                }

                if (!flag) {
                    // try to match with first character of first row

                    char b = s[0].charAt(0);

                    // Search in last row
                    char last[] = s[n - 1].toCharArray();
                    boolean d = false;
                    for (int i = 0; i < last.length; i++) {
                        if (last[i] == b) {
                            d = true;
                            break;
                        }
                    }

                    if (d) {
                        // Search in last column
                        for (int i = 0; i < n; i++) {
                            if (s[i].charAt(m - 1) == b) {
                                flag = true;
                                break;
                            }
                        }
                    }
                }
            }

            // CASE II -> TOP RIGHT and BOTTOM LEFT
            if (!flag) {
                if (s[0].charAt(m - 1) == s[n - 1].charAt(0)) {
                    flag = true;
                }
            }

            if (!flag) {
                // Try to match with the last character of first row
                char c = s[0].charAt(m - 1);

                // Search in first row for 'c'
                char first[] = s[n - 1].toCharArray();
                boolean a = false;
                for (int i = 0; i < first.length; i++) {
                    if (first[i] == c) {
                        a = true;
                        break;
                    }
                }

                if (a) {
                    // Check first col
                    for (int i = 0; i < n; i++) {
                        if (s[i].charAt(0) == c) {
                            flag = true;
                            break;
                        }
                    }
                }

                if (!flag) {
                    // try to match with first character of last row

                    char b = s[n - 1].charAt(0);

                    // Search in last row
                    char last[] = s[0].toCharArray();
                    boolean d = false;
                    for (int i = 0; i < last.length; i++) {
                        if (last[i] == b) {
                            d = true;
                            break;
                        }
                    }

                    if (d) {
                        // Search in last column
                        for (int i = 0; i < n; i++) {
                            if (s[i].charAt(m - 1) == b) {
                                flag = true;
                                break;
                            }
                        }
                    }
                }
            }

            if (flag) {
                System.out.println("yEs");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}