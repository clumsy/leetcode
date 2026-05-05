class Solution:
    def findMode(self, root: Optional[TreeNode]) -> List[int]:
        self.max_count = 0
        self.mode_count = 0
        self.current_val = 0
        self.current_count = 0

        self.inorder(root)
        self.current_count = 0
        return self.inorder(root, [])

    def inorder(self, root, modes=None):
        node = root
        while node:
            if not node.left:
                self.handle_value(node.val, modes)
                node = node.right
            else:
                prev = node.left
                while prev.right and prev.right != node:
                    prev = prev.right
                if not prev.right:
                    prev.right = node
                    node = node.left
                else:
                    prev.right = None
                    self.handle_value(node.val, modes)
                    node = node.right
        return modes

    def handle_value(self, val, modes):
        if val != self.current_val:
            self.current_val = val
            self.current_count = 0
        self.current_count += 1
        if self.current_count > self.max_count:
            self.max_count = self.current_count
            self.mode_count = 1
        elif self.current_count == self.max_count:
            if modes is not None:
                modes.append(val)
            else:
                self.mode_count += 1
