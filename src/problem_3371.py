class Solution:
    def getLargestOutlier(self, nums: List[int]) -> int:
        cnt = Counter(nums)
        fs = sum(nums)
        res = -inf
        for o in cnt:
            ps = fs - o
            s = ps // 2
            if 2 * s == ps and cnt[s] > int(s == o):
                res = max(res, o)
        return res
