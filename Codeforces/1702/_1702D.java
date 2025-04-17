// Not a Cheap String

import java.util.*;

public class _1702D {
    public static int findPos(int[] arr) {
        for (int i = 25; i >= 0; i--) {
            if (arr[i] != 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            long p = sc.nextLong();

            int freq[] = new int[26];

            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }

            long sum = 0;
            for (int i = 0; i < 26; i++) {
                sum += (freq[i] * (i + 1));
            }

            boolean flag = true;
            if (sum > p) {
                while (sum > p) {
                    // Take the freedy approach and remove the elements from the one that will have
                    // the most impact.
                    int pos = findPos(freq);

                    if (pos == -1) {
                        flag = false;
                        break;
                    }

                    while (true) {
                        if (freq[pos] != 0) {
                            sum -= pos + 1;
                            freq[pos]--;

                            if (sum <= p) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }

                if (!flag) {
                    System.out.println("");
                } else {
                    // Forming the original string.
                    StringBuilder sb = new StringBuilder();

                    // ONly append this character if it still present in the frequency counter.
                    for (int i = 0; i < s.length(); i++) {
                        if (freq[s.charAt(i) - 'a'] > 0) {
                            sb.append(s.charAt(i));
                            freq[s.charAt(i) - 'a']--;
                        }
                    }

                    System.out.println(sb);
                }
            } else {
                System.out.println(s);
            }
        }
        sc.close();
    }
}