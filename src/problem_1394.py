class Solution:
    def findLucky(self, arr: List[int]) -> int:
        cnt, res = Counter(arr), -1
        for i in cnt:
            res = max(res, i) if cnt[i] == i else res
        return res
