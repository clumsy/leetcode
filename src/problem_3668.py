class Solution:
    def recoverOrder(self, o: List[int], fs: List[int]) -> List[int]:
        fs = set(fs)
        res = [i for i in o if i in fs]
        return res
