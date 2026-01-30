class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        cnt = Counter(arr)
        res = len(cnt) == len(set(cnt.values()))
        return res
