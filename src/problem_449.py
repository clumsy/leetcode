class Codec:
    def serialize(self, root: Optional[TreeNode]) -> str:
        """Encodes a tree to a single string."""
        chunks = []

        def dfs(node):
            if node is None:
                chunks.append("")
            else:
                chunks.append(str(node.val))
                dfs(node.left)
                dfs(node.right)

        dfs(root)
        return ",".join(chunks)

    def deserialize(self, data: str) -> Optional[TreeNode]:
        """Decodes your encoded data to tree."""

        def dfs(data):
            val = next(data)
            if not val:
                return None
            root = TreeNode(int(val))
            root.left = dfs(data)
            root.right = dfs(data)
            return root

        return dfs(iter(data.split(",")))
