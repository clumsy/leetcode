package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.STACK)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem20 {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int size = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                default:
                    stack[size++] = c;
                    break;
                case '}':
                    if (size == 0 || stack[--size] != '{') {
                        return false;
                    }
                    break;
                case ')':
                    if (size == 0 || stack[--size] != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (size == 0 || stack[--size] != '[') {
                        return false;
                    }
                    break;
            }
        }
        return size == 0;
    }
}
