class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        lo, hi = 0, len(numbers) - 1
        while lo < hi:
            diff = numbers[lo] + numbers[hi] - target
            if diff == 0:
                return [lo + 1, hi + 1]
            elif diff > 0:
                hi -= 1
            else:
                lo += 1
