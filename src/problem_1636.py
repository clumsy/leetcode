class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        cnt = Counter(nums)
        nums.sort(key=lambda i: (cnt[i], -i))
        return nums
