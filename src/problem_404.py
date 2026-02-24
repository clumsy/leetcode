class Solution:
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        def dfs(node, parent):
            if node is None:
                return 0
            if node.left is None and node.right is None:
                return node.val if parent and parent.left == node else 0
            return dfs(node.left, node) + dfs(node.right, node)

        res = dfs(root, None)
        return res
