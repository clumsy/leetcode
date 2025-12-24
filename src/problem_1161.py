class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        levels = []

        def dfs(c, d):
            if not c:
                return
            if len(levels) < d + 1:
                levels.append(0)
            levels[d] += c.val
            dfs(c.left, d + 1)
            dfs(c.right, d + 1)

        dfs(root, 0)
        res = 1
        for i, e in enumerate(levels):
            if e > levels[res - 1]:
                res = i + 1
        return res
