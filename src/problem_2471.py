# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minimumOperations(self, root: Optional[TreeNode]) -> int:
        lvls = []
        def dfs(x, d=0):
            if not x:
                return
            if len(lvls) < d + 1:
                lvls.append([])
            lvls[d].append(x.val)
            dfs(x.left, d + 1)
            dfs(x.right, d + 1)
        dfs(root)
        res = 0
        for lvl in lvls:
            n = len(lvl)
            o = sorted(range(n), key=lambda i: lvl[i])
            pos = {v: i for i, v in enumerate(o)}
            for i in range(n - 1):
                res += o[i] != i
                o[i], o[pos[i]], pos[o[pos[i]]] = o[pos[i]], o[i], pos[i]
        return res
