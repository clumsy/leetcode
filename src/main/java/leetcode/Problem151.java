package leetcode;

import java.util.Stack;

public class Problem151 {
    public static final class Alternative extends Problem151 {

        @Override
        public String reverseWords(String s) {
            if (s == null || s.isEmpty()) {
                return s;
            }
            char[] chars = s.toCharArray();
            int inputLength = chars.length;
            StringBuilder result = new StringBuilder(inputLength);
            for (int i = inputLength - 1; i >= 0; --i) {
                char c = chars[i];
                if (c == ' ') {
                    continue;
                }
                while (c != ' ') {
                    result.append(c);
                    if (i == 0) {
                        break;
                    }
                    c = chars[--i];
                }
                result.append(' ');
            }
            if (result.length() == 0) {
                return "";
            }
            result.setLength(result.length() - 1);
            int length = result.length();
            for (int current = 0, start = 0; current <= length; current++) {
                if (current > start && (current == length || result.charAt(current) == ' ')) {
                    for (int i = current - 1; i >= start; --i, start++) {
                        char tmp = result.charAt(start);
                        result.setCharAt(start, result.charAt(i));
                        result.setCharAt(i, tmp);
                    }
                    start = current + 1;
                }
            }
            return result.toString();
        }
    }

    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        Stack<String> stack = new Stack<>();
        for (String str : s.split(" ")) {
            if (!" ".equals(str) && !str.isEmpty()) {
                stack.add(str);
            }
        }
        if (stack.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }
        result.setLength(result.length() - 1);
        return result.toString();
    }
}
