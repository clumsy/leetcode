class Solution:
    def countBalls(self, l: int, h: int) -> int:
        res = Counter(sum(int(d) for d in str(n)) for n in range(l, h + 1)).most_common()[0][1]
        return res
