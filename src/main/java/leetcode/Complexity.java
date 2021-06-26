package leetcode;

public enum Complexity {
    CONSTANT("O(1)"),
    LOGARITHMIC_N("O(log(N))"),
    SQRT_N("O(√N)"),
    LINEAR_N("O(N)"),
    LINEAR_K("O(K)"),
    LINEARITHMIC_N("O(N×log(N))"),
    QUADRATIC_N("O(N²)"),
    N_BY_M("O(N×M)"),
    N_PLUS_K("O(N+K)"),
    CUBIC_N("O(N³)"),
    EXPONENTIAL_N("O(2ⁿ)"),
    EXPONENTIAL_3K("O(3ᵏ)"),
    FACTORIAL_N("O(n!)"),
    UNKNOWN("O(?)");

    private final String value;

    Complexity(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
