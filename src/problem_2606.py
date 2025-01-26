class Solution:
    def maximumCostSubstring(self, s: str, chars: str, vals: List[int]) -> int:
        vals = {k: v for k, v in zip(chars, vals)}
        res = cur = 0
        for c in s:
            val = vals.get(c, ord(c) - ord("a") + 1)
            cur = max(0, cur + val)
            res = max(res, cur)
        return res
