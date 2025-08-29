class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        res = []
        for i in range(left, right + 1):
            ds = set(str(i))
            if "0" not in ds and all(i % int(d) == 0 for d in ds):
                res.append(i)
        return res
