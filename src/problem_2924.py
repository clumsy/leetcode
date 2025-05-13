class Solution:
    def findChampion(self, n: int, edges: List[List[int]]) -> int:
        res = set(range(n))
        for s, w in edges:
            if w in res:
                res.remove(w)
        res = res.pop() if len(res) == 1 else -1
        return res
