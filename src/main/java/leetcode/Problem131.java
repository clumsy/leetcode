package leetcode;

import java.util.ArrayList;
import java.util.List;

@BeatsPercent(100)
public class Problem131 {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        collect(result, s, 0, new ArrayList<>());
        return result;
    }
    
    private void collect(List<List<String>> result, String s, int offset, List<String> current) {
        if (offset >= s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = offset + 1; i <= s.length(); i++) {
            String sub = s.substring(offset, i);
            if (isPalindrome(sub)) {
                current.add(sub);
                collect(result, s, i, current);
                current.remove(current.size() - 1);
            }
        }
    }
    
    private boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
