class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        q, res = deque([root]), []
        while q:
            n, s = len(q), 0
            for _ in range(n):
                cur = q.popleft()
                s += cur.val
                if cur.left:
                    q.append(cur.left)
                if cur.right:
                    q.append(cur.right)
            res.append(s / n)
        return res
