class Solution:
    def maxBalancedShipments(self, ws: List[int]) -> int:
        res, lst = 0, len(ws) - 1
        while lst > 0:
            nxt = lst - 1
            if ws[lst] < ws[nxt]:
                res += 1
                lst -= 2
            else:
                lst -= 1
        return res
