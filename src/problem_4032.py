class Solution:
    def longestSubarray(self, nums: list[int], k: int) -> int:
        n = max(nums) + 1
        ps = [i for i in range(n)]
        for i in range(2, n):
            if ps[i] == i:
                for j in range(i * i, n, i):
                    ps[j] = i
        res = s = 0
        cnt = defaultdict(int)
        for i, e in enumerate(nums):
            while e > 1:
                cnt[ps[e]] += 1
                if cnt[ps[e]] == 1:
                    k -= 1
                e = e // ps[e]
            while s <= i and k < 0:
                e = nums[s]
                cnt[ps[e]]
                while e > 1:
                    cnt[ps[e]] -= 1
                    if cnt[ps[e]] == 0:
                        k += 1
                    e //= ps[e]
                s += 1
            res = max(res, i - s + 1)
        return res
