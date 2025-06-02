class Solution:
    def divideArray(self, nums: List[int], k: int) -> List[List[int]]:
        nums.sort()
        res, n, cur = [], len(nums), []
        for i in range(len(nums)):
            cur.append(nums[i])
            if len(cur) < 3:
                continue
            if cur[-1] - cur[0] <= k:
                res.append(cur)
                cur = []
            else:
                res = []
                break
        return res
