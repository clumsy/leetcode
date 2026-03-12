class Solution:
    def minDistinctFreqPair(self, nums: list[int]) -> list[int]:
        cnt, res = Counter(nums), [-1, -1]
        x, xc = min(cnt.items())
        for y, yc in sorted(cnt.items()):
            if x < y and xc != yc:
                res = [x, y]
                break
        return res
