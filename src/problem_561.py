class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        cnt = Counter(nums)
        res, cur = 0, None
        for i in range(-10000, 10001):
            if not cnt[i]:
                continue
            if cur is not None:
                res += cur
                cnt[i] -= 1
            res += i * (cnt[i] // 2)
            cur = i if cnt[i] & 1 == 1 else None
        return res
