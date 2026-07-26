# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def countDominantNodes(self, root: TreeNode | None) -> int:
        def dfs(cur):
            if not cur:
                return 0, 0
            cl, vl = dfs(cur.left)
            cr, vr = dfs(cur.right)
            m = max(vl, vr)
            return cl + cr + (cur.val >= m), max(m, cur.val)

        res, _ = dfs(root)
        return res
