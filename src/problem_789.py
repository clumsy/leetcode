class Solution:
    def escapeGhosts(self, ghosts: List[List[int]], target: List[int]) -> bool:
        res = min(abs(target[0] - g[0]) + abs(target[1] - g[1]) for g in ghosts) > sum(abs(i) for i in target)
        return res
