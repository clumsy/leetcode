class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        c1 = Counter(arr1)
        res = []
        for i in arr2:
            if i in c1:
                res.extend([i] * c1[i])
                del c1[i]
        for i in range(1001):
            if i in c1:
                res.extend([i] * c1[i])
        return res
