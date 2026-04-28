class Solution:
    def duplicateZeros(self, arr: List[int]) -> None:
        """
        Do not return anything, modify arr in-place instead.
        """
        n = len(arr)
        i = z = 0
        while i + z < n:
            z += arr[i] == 0
            i += 1
        i -= 1
        while z > 0:
            if i + z < n:
                arr[i + z] = arr[i]
            if arr[i] == 0:
                z -= 1
                arr[i + z] = arr[i]
            i -= 1
