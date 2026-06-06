class Solution:
    def findNumberOfLIS(self, nums: List[int]) -> int:
        dp = defaultdict(lambda: (0, 0))  # num -> (length, count)
        max_length = 0
        for num in nums:
            dp[num] = self.merge(dp[num], (1, 1))
            for k in dp.keys():
                if k < num:
                    dp[num] = self.merge(dp[num], dp[k])
            max_length = max(max_length, dp[num][0])
        return sum(count for length, count in dp.values() if length == max_length)

    def merge(self, a, b):
        cur_length, cur_count = a
        new_length, new_count = b
        new_length += 1
        if cur_length <= new_length:
            cur_count = new_count + (cur_count if cur_length == new_length else 0)
        return (max(cur_length, new_length), cur_count)
