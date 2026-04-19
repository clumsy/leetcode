class Solution:
    def simplifiedFractions(self, n: int) -> List[str]:
        res = [f"{n_}/{d_}" for d_ in range(2, n + 1) for n_ in range(1, d_) if gcd(n_, d_) == 1]
        return res
