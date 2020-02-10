package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem93 {
    public static final class Alternative extends Problem93 {

        @Override
        public List<String> restoreIpAddresses(String s) {
            List<String> result = new ArrayList<>();
            collect(s.toCharArray(), 0, new StringBuilder(), 0, result);
            return result;
        }

        private void collect(char[] s, int offset, StringBuilder current, int size, List<String> result) {
            if (size >= 4) {
                if (offset >= s.length) {
                    current.setLength(current.length() - 1);
                    result.add(current.toString());
                }
                return;
            }
            for (int i = offset, octet = 0; i < s.length; i++) {
                octet = (s[i] - '0') + 10*octet;
                if (octet > 255) {
                    break;
                }
                int length = current.length();
                current.append(octet).append('.');
                collect(s, i + 1, current, size + 1, result);
                current.setLength(length);
            }
        }
    }


    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        for (int i3 = 3; i3 < s.length(); i3++) {
            int l4 = s.length() - i3;
            if (l4 > 3 || (s.charAt(i3) == '0' && l4 > 1)) {
                continue;
            }
            int o4 = Integer.parseInt(s.substring(i3));
            if (o4 > 255) {
                continue;
            }
            for (int i2 = 2; i2 < i3; i2++) {
                int l3 = i3 - i2;
                if (l3 > 3 || (s.charAt(i2) == '0' && l3 > 1)) {
                    continue;
                }
                int o3 = Integer.parseInt(s.substring(i2, i3));
                if (o3 > 255) {
                    continue;
                }
                for (int i1 = 1; i1 < i2; i1++) {
                    int l2 = i2 - i1;
                    if (l2 > 3 || (s.charAt(i1) == '0' && l2 > 1)) {
                        continue;
                    }
                    int o2 = Integer.parseInt(s.substring(i1, i2));
                    if (o2 > 255) {
                        continue;
                    }
                    if (i1 > 3 || (s.charAt(0) == '0' && i1 > 1)) {
                        continue;
                    }
                    int o1 = Integer.parseInt(s.substring(0, i1));
                    if (o1 > 255) {
                        continue;
                    }
                    result.add(o1 + "." + o2 + "." + o3 + "." + o4);
                }
            }
        }
        return result;
    }
}
