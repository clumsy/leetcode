package leetcode;

public class Problem38 {
    public String countAndSay(int n) {
        switch (n) {
            case 1:
                return "1";
            case 2:
                return "11";
            case 3:
                return "21";
            case 4:
                return "1211";
            case 5:
                return "111221";
        }
        String previous = countAndSay(n - 1);
        StringBuilder builder = new StringBuilder();
        char next, current = previous.charAt(0);
        int count = 1;
        for (int i = 1, length = previous.length(); i < length; i++) {
            next = previous.charAt(i);
            if (current == next) {
                count++;
            } else {
                builder.append(count).append(current);
                count = 1;
                current = next;
            }
        }
        builder.append(count).append(current);
        return builder.toString();
    }
}
