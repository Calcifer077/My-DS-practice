package leetcode;

public class find_the_index_of_the_first_occurrence_in_a_string {
    public static int strStr(String haystack, String needle) {
        int res = -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int a = i;
                int size = 1;
                for (int j = 1; j < needle.length() && i + j < haystack.length(); j++) {
                    if (haystack.charAt(i + j) == needle.charAt(j)) {
                        size++;
                    } else {
                        break;
                    }
                }
                if (size == needle.length()) {
                    res = a;
                    break;
                }
            }
        }

        return res;

    }

    public static void main(String[] args) {
        String a = "aaa";
        String b = "aaaa";
        System.out.println(strStr(a, b));
    }
}
