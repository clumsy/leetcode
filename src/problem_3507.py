class Solution:
    def minimumPairRemoval(self, nums: List[int]) -> int:
        class Node:
            def __init__(self, val, nxt=None):
                self.val = val
                self.nxt = nxt
        root = cur = Node(0)
        for i in nums:
            cur.nxt = Node(i)
            cur = cur.nxt
        res, fnd = 0, True
        while fnd:
            fnd = False
            cur = mi = root.nxt
            while cur.nxt:
                fnd |= cur.nxt.val < cur.val
                mi = cur if cur.val + cur.nxt.val < mi.val + mi.nxt.val else mi
                cur = cur.nxt
            if fnd:
                mi.val += mi.nxt.val
                mi.nxt = mi.nxt.nxt
                res += 1
        return res
