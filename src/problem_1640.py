class Solution:
    def canFormArray(self, arr: List[int], pieces: List[List[int]]) -> bool:
        piece_starts = {p[0]: i for i, p in enumerate(pieces)}
        res, i = True, 0
        while res and i < len(arr):
            p = piece_starts.get(arr[i], None)
            if p is None:
                res = False
                break
            for piece in pieces[p]:
                if arr[i] != piece:
                    res = False
                    break
                i += 1
        return res
