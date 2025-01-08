package leetcode;

public class longest_common_prefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        if (strs.length == 1) {
            return strs[0];
        }

        int j = 0;

        while (true) {
            if (!(strs[0].length() > j)) {
                break;
            }
            char ch = strs[0].charAt(j);

            boolean flag = false;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() > j) {

                    if (strs[i].charAt(j) != ch) {
                        flag = true;
                        break;
                    }
                } else {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                break;
            }

            res.append(ch);
            j++;
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String strs[] = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }
}
