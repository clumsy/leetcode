class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        res, cnt = [], Counter()
        for i in nums:
            if len(res) <= cnt[i]:
                res.append([])
            res[cnt[i]].append(i)
            cnt[i] += 1
        return res
