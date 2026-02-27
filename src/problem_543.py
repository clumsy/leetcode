class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        def dfs(node, res):
            if not node:
                return 0, res
            if node.left is None and node.right is None:
                return 1, res
            lft, lft_res = dfs(node.left, res)
            rgt, rgt_res = dfs(node.right, res)
            res = max(res, lft_res, rgt_res, lft + rgt)
            return 1 + max(lft, rgt), res

        _, res = dfs(root, 0)
        return res
