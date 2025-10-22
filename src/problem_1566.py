class Solution:
    def containsPattern(self, arr: List[int], m: int, k: int) -> bool:
        cnt = 0
        for i in range(len(arr) - m):
            cnt = cnt + 1 if arr[i] == arr[i + m] else 0
            if cnt == m * (k - 1):  # found k - 1 groups matching arr[i:i + m]
                break
        res = cnt == m * (k - 1)
        return res
