class Solution:
    def addOneRow(self, root: Optional[TreeNode], val: int, depth: int) -> Optional[TreeNode]:
        def dfs(node, d):
            if node is None:
                return
            if d == depth - 1:
                node.left = TreeNode(val, left=node.left)
                node.right = TreeNode(val, right=node.right)
            else:
                dfs(node.left, d + 1)
                dfs(node.right, d + 1)
        root = TreeNode(-1, left=root)
        dfs(root, 0)
        res = root.left
        return res
