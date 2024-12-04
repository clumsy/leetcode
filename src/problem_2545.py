class Solution:
    def sortTheStudents(self, score: List[List[int]], k: int) -> List[List[int]]:
        def order(lst):
            return -lst[k]
        score.sort(key=order)
        res = score
        return res
