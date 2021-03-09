package leetcode;

public enum Complexity {
    CONSTANT("O(1)"),
    LOGARITHMIC_N("O(log(N))"),
    LINEAR_N("O(N)"),
    LINEARITHMIC_N("O(N*log(N))"),
    QUADRATIC_N("O(N^2)"),
    N_BY_M("O(N*M)"),
    CUBIC_N("O(N^3)"),
    EXPONENTIAL_N("O(2^N)");

    private final String value;

    Complexity(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
