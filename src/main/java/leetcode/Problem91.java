package leetcode;

@Beats100Percent
public class Problem91 {
    public int numDecodings(String s) {
        int N = s.length();
        if (N == 0) {
            return 0;
        }
        int[] cache = new int[N + 1];
        for (int i = 0; i < N; i++) {
            cache[i] = -1;
        }
        cache[N] = 1; // if we got to the last digit and it wasn't 0 we got 1 way
        count(s, 0, N, cache);
        return cache[0];
    }

    private int count(String s, int start, int end, int[] cache) {
        int cached = cache[start];
        if (cached >= 0) {
            return cached;
        }
        char first = s.charAt(start);
        if (first == '0') {
            cache[start] = 0;
            return 0;
        }
        int N = s.length();
        int count = count(s, start + 1, N, cache);
        if (start < N - 1 && Integer.parseInt(s.substring(start, start + 2)) < 27) {
            count += count(s, start + 2, N, cache);
        }
        cache[start] = count;
        return count;
    }
}
