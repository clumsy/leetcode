class Solution:
    def maximumImportance(self, n: int, roads: List[List[int]]) -> int:
        inc_ = [0] * n
        for i, j in roads:
            inc_[i] += 1
            inc_[j] += 1
        ord_ = sorted(range(n), key=inc_.__getitem__)
        imp_ = {c: i + 1 for i, c in enumerate(ord_)}
        res = sum(imp_[i] + imp_[j] for i, j in roads)
        return res
