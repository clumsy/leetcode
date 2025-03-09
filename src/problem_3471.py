class Solution:
    def largestInteger(self, nums: List[int], k: int) -> int:
        if k < len(nums):
            cnt = Counter(nums)
            if k == 1:
                res = max((k for k, v in cnt.items() if v == 1), default=-1)
            else:
                mi, ma = sorted([nums[0], nums[-1]])
                if cnt[ma] == 1:
                    res = ma
                elif cnt[mi] == 1:
                    res = mi
                else:
                    res = -1
        else:
            res = max(nums)
        return res
