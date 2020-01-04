package leetcode;

public class Problem14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int position = prefix.length();
        for (int i = 1; i < strs.length; i++) {
            if (position == 0) {
                return "";
            }
            String next = strs[i];
            position = Math.min(position, next.length());
            for (int j = 0; j < position; j++) {
                if (prefix.charAt(j) != next.charAt(j)) {
                    position = j;
                    break;
                }
            }
        }
        if (position == prefix.length()) {
            return prefix;
        }
        return prefix.substring(0, position);
    }
}
