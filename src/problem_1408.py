class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        res = [w for w in words if any(w in k for k in words if k != w)]
        return res
