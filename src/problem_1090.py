class Solution:
    def largestValsFromLabels(self, values: List[int], labels: List[int], numWanted: int, useLimit: int) -> int:
        pairs = sorted(zip(values, labels), reverse=True)
        res, cnt = 0, Counter()
        for v, l in pairs:
            if not numWanted:
                break
            if cnt[l] < useLimit:
                cnt[l] += 1
                res += v
                numWanted -= 1
        return res
