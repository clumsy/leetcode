class Solution:
    def subarraysWithKDistinct(self, nums: List[int], k: int) -> int:
        def at_most(x):
            res = i = 0
            uniq = Counter()
            for j in range(len(nums)):
                uniq[nums[j]] += 1
                while i <= j and len(uniq) > x:
                    uniq[nums[i]] -= 1
                    if uniq[nums[i]] == 0:
                        del uniq[nums[i]]
                    i += 1
                res += j - i + 1
            return res
        res = at_most(k) - at_most(k - 1)
        return res
