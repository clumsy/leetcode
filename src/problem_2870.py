class Solution:
    def minOperations(self, nums: List[int]) -> int:
        cnt = Counter(Counter(nums).values())
        res = 0
        for k, v in cnt.items():
          if k < 2:
            res = -1
            break
          d, r = divmod(k, 3)
          res += v * (d + (r > 0))
        return res
