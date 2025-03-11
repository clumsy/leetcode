class Solution:
    def numOfUnplacedFruits(self, fs: List[int], bs: List[int]) -> int:
        res = 0
        for f in fs:
            for i, b in enumerate(bs):
                if b >= f:
                    bs[i] = 0
                    break
            else:
                res += 1
        return res
