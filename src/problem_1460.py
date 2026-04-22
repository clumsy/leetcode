class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        res = Counter(target) == Counter(arr)
        return res
