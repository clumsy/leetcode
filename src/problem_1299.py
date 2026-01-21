class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        ma = -1
        for i in range(len(arr))[::-1]:
            arr[i], ma = ma, max(ma, arr[i])
        return arr
