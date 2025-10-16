class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        n = len(arr)
        ma, mi = -inf, inf
        for i in arr:
            ma = max(ma, i)
            mi = min(mi, i)
        d, r = divmod(ma - mi, n - 1)
        if r != 0:
            return False
        i = 0
        while i < n:
            if arr[i] == mi + d * i:  # where it should be
                i += 1
            else:
                j, r = divmod(arr[i] - mi, d)
                if r != 0 or j < i or arr[i] == arr[j]:
                    return False
                arr[i], arr[j] = arr[j], arr[i]
        return True
