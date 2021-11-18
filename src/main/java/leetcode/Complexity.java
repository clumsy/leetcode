package leetcode;

public enum Complexity {
    CONSTANT("O(1)"),
    INFINITY("O(∞)"),
    LOGARITHMIC_N("O(log(N))"),
    K_LOG_N("O(K×log(N))"),
    LOG_N_SQUARED("O(log²(N))"),
    SQRT_N("O(√N)"),
    N_SQRT_N("O(N×√N)"),
    LINEAR_N("O(N)"),
    LINEAR_K("O(K)"),
    LINEARITHMIC_N("O(N×log(N))"),
    QUADRATIC_N("O(N²)"),
    N_BY_M("O(N×M)"),
    LOG_N_PLUS_LOG_M("O(log(N)+log(M))"),
    TWO_TO_N("O(2ⁿ)"),
    K_TO_N("O(kⁿ)"),
    N_PLUS_K("O(N+K)"),
    N_TO_K("O(Nᵏ)"),
    N_PLUS_M("O(N+M)"),
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
