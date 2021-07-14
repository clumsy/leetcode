package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@BeatsPercent(84.97)
@TimeComplexity(Complexity.K_TO_N)
@SpaceComplexity(Complexity.K_TO_N)
public class Problem753 {
    public String crackSafe(int n, int k) {
        Set<String> seen = new HashSet<>();
        List<Integer> edges = new ArrayList<>();
        String alphabet = alphabet(k);
        String start = string(n - 1, alphabet.charAt(0));
        dfs(alphabet, k, start, seen, edges);
        StringBuilder de_bruijn = new StringBuilder();
        for (int edge : edges) {
            de_bruijn.append(alphabet.charAt(edge));
        }
        de_bruijn.append(start);
        return de_bruijn.toString();
    }

    private static void dfs(String alphabet, int k, String current, Set<String> seen, List<Integer> edges) {
        StringBuilder sb = new StringBuilder(current);
        for (int i = 0; i < k; i++) {
            sb.append(alphabet.charAt(i));
            if (seen.add(sb.toString())) { // new
                dfs(alphabet, k, sb.substring(1), seen, edges);
                edges.add(i);
            }
            sb.setLength(sb.length() - 1);
        }
    }

    private static String alphabet(int k) {
        StringBuilder sb = new StringBuilder(k);
        for (int i = 0; i < k; i++) {
            sb.append((char) ('0' + i));
        }
        return sb.toString();
    }

    private static String string(int n, char ch) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
