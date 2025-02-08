// Unique number

import java.util.*;

public class _1462C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            if (n > 45) {
                System.out.println(-1);
            } else {
                if (n <= 9) {
                    System.out.println(n);
                } else {
                    HashSet<Integer> set = new HashSet<>();
                    for (int i = 1; i < 10; i++) {
                        set.add(i);
                    }

                    boolean flag = true;

                    StringBuilder res = new StringBuilder();
                    while (n > 0) {
                        if (n >= 9 && set.contains(9)) {
                            res.append(Integer.toString(9));
                            set.remove(9);
                            n -= 9;
                        } else if (n >= 8 && set.contains(8)) {
                            res.append(Integer.toString(8));
                            set.remove(8);
                            n -= 8;
                        } else if (n >= 7 && set.contains(7)) {
                            res.append(Integer.toString(7));
                            set.remove(7);
                            n -= 7;
                        } else if (n >= 6 && set.contains(6)) {
                            res.append(Integer.toString(6));
                            set.remove(6);
                            n -= 6;
                        } else if (n >= 5 && set.contains(5)) {
                            res.append(Integer.toString(5));
                            set.remove(5);
                            n -= 5;
                        } else if (n >= 4 && set.contains(4)) {
                            res.append(Integer.toString(4));
                            set.remove(4);
                            n -= 4;
                        } else if (n >= 3 && set.contains(3)) {
                            res.append(Integer.toString(3));
                            set.remove(3);
                            n -= 3;
                        } else if (n >= 2 && set.contains(2)) {
                            res.append(Integer.toString(2));
                            set.remove(2);
                            n -= 2;
                        } else if (n >= 1 && set.contains(1)) {
                            res.append(Integer.toString(1));
                            set.remove(1);
                            n -= 1;
                        } else {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        System.out.println(res.reverse());
                    } else {
                        System.out.println(-1);
                    }

                }

            }
            t--;
        }
        sc.close();
    }
}
