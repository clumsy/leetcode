class Solution:
    def checkTree(self, root: Optional[TreeNode]) -> bool:
        res = root.val == (root.left.val + root.right.val)
        return res
