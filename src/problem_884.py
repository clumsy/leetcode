class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        cnt = Counter((s1 + " " + s2).split())
        res = [s for s in cnt if cnt[s] == 1]
        return res
