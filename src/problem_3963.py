class Solution:
    def createGrid(self, m: int, n: int) -> list[str]:
        res = ["".join("." if r == 0 or c == n - 1 else "#" for c in range(n)) for r in range(m)]
        return res
