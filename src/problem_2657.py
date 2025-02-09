class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        n = len(A)
        res, cnt = [0] * n, [0] * n
        for i, (a, b) in enumerate(zip(A, B)):
            a, b = a - 1, b - 1
            res[i] = (res[i - 1] if i > 0 else 0) + (cnt[a] == 1)
            cnt[a] += 1
            res[i] += cnt[b] == 1
            cnt[b] += 1
        return res
