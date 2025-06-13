class Solution:
    def countNodes(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        dl, dr = 0, 0
        c = root
        while c:
            c = c.left
            dl += 1
        c = root
        while c:
            c = c.right
            dr += 1
        if dl == dr:
            return 2 ** dl - 1
        return 1 + self.countNodes(root.left) + self.countNodes(root.right)
