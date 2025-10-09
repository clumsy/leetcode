class Solution:
    def sumZero(self, n: int) -> List[int]:
        half = [i for i in range(1, n // 2 + 1)]
        res = [-i for i in half] + ([0] if n & 1 == 1 else []) + half
        return res
