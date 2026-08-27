class Solution:
    def mapWordWeights(self, ws: List[str], wss: List[int]) -> str:
        res = "".join(
            chr(ord("z") - (sum(wss[ord(c) - ord("a")] for c in w) % 26)) for w in ws
        )
        return res
