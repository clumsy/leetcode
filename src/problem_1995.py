class Solution:
    def countQuadruplets(self, nums: List[int]) -> int:
        n, res = len(nums), 0
        seen = Counter()
        # i splits in two chunks, one with nums[a] + nums[b] and nums[d] - nums[c]
        # we will populate nums[d] - nums[c], so starting iteration from right
        for i in range(n - 2, 1, -1):
            # c == i
            for d in range(i + 1, n):
                seen[nums[d] - nums[i]] += 1
            # b == i - 1
            for a in range(i - 1):
                res += seen[nums[a] + nums[i - 1]]
        return res
