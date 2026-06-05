from typing import Optional
from heapq import heappop, heappush


class Solution:
    def findSecondMinimumValue(self, root: Optional[TreeNode]) -> int:
        h, q = [], [root]
        while q:
            cur = q.pop()
            if not cur:
                continue
            if -cur.val not in h:
                heappush(h, -cur.val)
            if len(h) > 2:
                heappop(h)
            q.append(cur.left)
            q.append(cur.right)
        res = -h[0] if len(h) > 1 else -1
        return res
