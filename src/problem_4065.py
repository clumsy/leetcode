class Solution:
    def rearrangeArray(self, nums: list[int]) -> list[int]:
        cnt, res = Counter(nums), []
        while cnt:
            for i in sorted(cnt.keys()):
                res.append(i)
                cnt[i] -= 1
                if cnt[i] == 0:
                    del cnt[i]
        return res
