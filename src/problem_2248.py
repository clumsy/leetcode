class Solution:
    def intersection(self, nums: List[List[int]]) -> List[int]:
        MAX = 1001
        n, arr = len(nums), [0] * MAX
        for num in nums:
            for i in num:
                arr[i] += 1
        res = [i for i in range(1, MAX) if arr[i] == n]
        return res
