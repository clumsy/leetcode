class Solution:
    def reorderedPowerOf2(self, n: int) -> bool:
        def norm(i):
            return "".join(sorted(str(i)))
        pwrs_of_2 = {norm(1 << p) for p in range(30)}
        res = norm(n) in pwrs_of_2
        return res
