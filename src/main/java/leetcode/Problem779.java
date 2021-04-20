package leetcode;

@BeatsPercent(100)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.LINEAR_N)
public class Problem779 {
    public int kthGrammar(int N, int K) {
        if (N == 1 && K == 1) {
            return 0;
        }
        int length = (int) Math.pow(2, N - 1);
        int half = length/2;
        if (K > half) {
            return invert(kthGrammar(N - 1, K - half));
        }
        return kthGrammar(N - 1, K);
    }

    private int invert(int value) {
        return value == 0 ? 1 : 0;
    }
}
