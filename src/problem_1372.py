class Solution:
    def longestZigZag(self, root: Optional[TreeNode]) -> int:
        self.res = 0

        def dfs(node):
            if node is None:
                return -1, -1
            lft, rgt = 1 + dfs(node.left)[1], 1 + dfs(node.right)[0]
            self.res = max(self.res, lft, rgt)
            return lft, rgt

        dfs(root)
        return self.res
