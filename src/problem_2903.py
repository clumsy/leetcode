class Solution:
    def findIndices(self, nums: List[int], id: int, vd: int) -> List[int]:
        res = [-1, -1]
        mi = ma = 0
        for i in range(id, len(nums)):
            mi = i - id if nums[i - id] < nums[mi] else mi
            ma = i - id if nums[i - id] > nums[ma] else ma
            if nums[i] - nums[mi] >= vd:
                res = [mi, i]
                break
            if nums[ma] - nums[i] >= vd:
                res = [ma, i]
                break
        return res
