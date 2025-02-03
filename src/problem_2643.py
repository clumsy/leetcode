class Solution:
    def rowAndMaximumOnes(self, mat: List[List[int]]) -> List[int]:
        res = [0, 0]
        for r, row in enumerate(mat):
            ones = sum(i == 1 for i in row)
            if ones > res[1]:
                res = [r, ones]
        return res
