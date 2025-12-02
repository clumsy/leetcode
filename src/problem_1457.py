class Solution:
    def pseudoPalindromicPaths(self, root: Optional[TreeNode]) -> int:
        def dfs(node, cnt=0):
            if not node:
                return 0
            cnt ^= 1 << (node.val - 1)
            res = dfs(node.left, cnt) + dfs(node.right, cnt)
            if node.left == node.right:
                res += cnt & (cnt - 1) == 0
            return res

        res = dfs(root)
        return res
