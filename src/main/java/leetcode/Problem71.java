package leetcode;

@BeatsPercent(95.81)
@TimeComplexity(best = Complexity.LINEAR_N)
@SpaceComplexity(best = Complexity.LINEAR_N)
public class Problem71 {
    public String simplifyPath(String path) {
        String[] chunks = path.split("/");
        int n = chunks.length;
        int[] stack = new int[n];
        int size = 0;
        for (int i = 0; i < n; i++) {
            String chunk = chunks[i];
            if (chunk.isEmpty() || ".".equals(chunk)) {
                continue;
            }
            if ("..".equals(chunk)) {
                size = Math.max(0, size - 1);
                continue;
            }
            if (++size > 0) {
                stack[size - 1] = i;
            }
        }
        if (size <= 0) {
            return "/";
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < size; i++) {
            answer.append('/');
            answer.append(chunks[stack[i]]);
        }
        return answer.toString();
    }
}
