package leetcode;

public class crawler_log_folder {
    public static int minOperations(String[] logs) {
        int res = 0;
        for (int i = 0; i < logs.length; i++) {
            String s = logs[i];
            if (s.equals("../")) {
                if (res > 0) {
                    res--;
                }

            } else {
                if (s.charAt(s.length() - 2) != '.') {
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String[] logs = { "d1/", "d2/", "../", "d21/", "./" };
        System.out.println(minOperations(logs));
    }
}
