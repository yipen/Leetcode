package array;

public class LongestPalindromicSubstring {
    public String longestPalindromeSubseq(String s) {
        if (s == null || s.isEmpty() || s.length() == 1) return s;
        char[] chars = new char[s.length() * 2 + 1];
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = '#';
            } else {
                chars[i] = s.charAt((i - 1) / 2);
            }
        }
        int count = 0;
        String result="";
        for (int i = 0; i < chars.length; i++) {
            int pre = i - 1;
            int aft = i + 1;
            while (pre >= 0 && aft < chars.length && chars[pre] == chars[aft]) {
                pre--;
                aft++;
            }
            if (count < (aft - pre) / 2 - 1) {
                count = (aft - pre) / 2 - 1;
                StringBuilder sb = new StringBuilder();
                for (int j = pre+1; j < aft; j++) {
                    if (j % 2 != 0) {
                        sb.append(chars[j]);
                    }
                }
                result = sb.toString();
            }
        }
        return result;
    }
}
