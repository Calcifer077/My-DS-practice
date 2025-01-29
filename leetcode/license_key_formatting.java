package leetcode;

public class license_key_formatting {
    public static String licenseKeyFormatting(String s, int k) {
        String res = "";

        res = s.replaceAll("-", "").toUpperCase();

        StringBuilder sb = new StringBuilder();

        if (res.length() == 0) {
            return "";
        }

        int n = res.length();
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            sb.append(res.charAt(i));
            count++;
            if (count % k == 0) {

                sb.append("-");
            }
        }

        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }

        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        System.out.println(licenseKeyFormatting(s, 4));
    }
}
