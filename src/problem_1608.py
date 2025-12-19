class Solution:
    def specialArray(self, nums: List[int]) -> int:
        c = [0] * 1001
        for i in nums:
            c[i] += 1
        for x in range(len(c) - 2, -1, -1):
            c[x] += c[x + 1]
            if x == c[x]:
                return x
        return -1
