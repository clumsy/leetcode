class Solution:
    def pancakeSort(self, arr: List[int]) -> List[int]:
        k, res = len(arr), []
        while k:
            i = max(range(k), key=arr.__getitem__)
            k -= 1
            if i < k:
                arr[:i + 1] = arr[i::-1]
                res.append(i + 1)
                arr[:k + 1] = arr[k::-1]
                res.append(k + 1)
        return res
