class Solution:
    def minSetSize(self, arr: List[int]) -> int:
        cnt = Counter(arr)
        cnt = list(accumulate(sorted(cnt.values(), reverse=True)))
        res = bisect_left(cnt, len(arr) // 2) + 1
        return res
