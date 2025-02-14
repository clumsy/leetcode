class Solution:
    def countSeniors(self, details: List[str]) -> int:
        res = sum(int(d[11:13]) > 60 for d in details)
        return res
