class Solution:
    def minDeletion(self, s: str, k: int) -> int:
        cnt = Counter(s)
        res = sum(nsmallest(len(cnt) - k, cnt.values()))
        return res
