package gfg;

import java.util.*;

public class union {
    // public static ArrayList<Integer> findUnion(int a[], int b[]) {
    // int n = a.length;
    // int m = b.length;
    // ArrayList<Integer> res = new ArrayList<>();

    // int i = 0;
    // int j = 0;
    // while (i < n && j < m) {
    // if (a[i] <= b[j]) {
    // if (res.size() == 0 || res.get(res.size() - 1) != a[i]) {
    // res.add(a[i]);
    // i++;
    // } else {
    // i++;
    // }
    // } else {
    // if (res.size() == 0 || res.get(res.size() - 1) != b[j]) {
    // res.add(b[j]);
    // j++;
    // } else {
    // j++;
    // }
    // }
    // }
    // while (i < n) {
    // if (res.size() == 0 || res.get(res.size() - 1) != a[i]) {
    // res.add(a[i]);
    // i++;
    // } else {
    // i++;
    // }
    // }

    // while (j < m) {
    // if (res.size() == 0 || res.get(res.size() - 1) != b[j]) {
    // res.add(b[j]);
    // j++;
    // } else {
    // j++;
    // }
    // }

    // for (int k = 0; k < res.size(); k++) {
    // System.out.println(res.get(k));
    // }

    // return res;
    // }

    //
    //
    //
    //
    //
    //
    //
    //
    //

    //

    //

    //

    //

    //

    //

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> res = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                if (res.size() == 0 || res.get(res.size() - 1) != a[i]) {
                    res.add(a[i]);
                    i++;
                } else {
                    i++;
                }
            } else {
                if (res.size() == 0 || res.get(res.size() - 1) != b[j]) {
                    res.add(b[j]);
                    j++;
                } else {
                    j++;
                }
            }
        }

        while (i < a.length) {
            if (res.size() == 0 || res.get(res.size() - 1) != a[i]) {
                res.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (res.size() == 0 || res.get(res.size() - 1) != b[j]) {
                res.add(b[j]);
            }
            j++;
        }

        for (int k = 0; k < res.size(); k++) {
            System.out.println(res.get(k));
        }

        return res;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 2, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9 };
        findUnion(a, b);
    }
}
