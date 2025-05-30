class Solution:
    def countTestedDevices(self, b: List[int]) -> int:
        res = 0
        for i in b:
            if i > res:
                res += 1
        return res
