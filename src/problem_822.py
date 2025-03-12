class Solution:
    def flipgame(self, f: List[int], b: List[int]) -> int:
        same = {x for x, y in zip(f, b) if x == y}
        return min((i for i in f + b if i not in same), default=0)
