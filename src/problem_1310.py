class Solution:
    def xorQueries(self, arr: List[int], queries: List[List[int]]) -> List[int]:
        xor = [0] * len(arr)
        for i in range(len(arr)):
            xor[i] = xor[i - 1] ^ arr[i] if i > 0 else arr[i]
        res = [None] * len(queries)
        for i, (l, r) in enumerate(queries):
            res[i] = xor[r] ^ xor[l - 1] if l > 0 else xor[r]
        return res
