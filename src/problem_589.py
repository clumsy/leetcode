# class Solution:
#     def preorder(self, root: Node) -> List[int]:
#         res = []
#         def _preorder(node):
#             if node is None:
#                 return
#             res.append(node.val)
#             for c in node.children:
#                 _preorder(c)
#         _preorder(root)
#         return res


class Solution:
    def preorder(self, root: "Node") -> List[int]:
        res, q = ([], [root])
        while q:
            node = q.pop()
            res.append(node.val)
            q.extend(node.children[::-1])
        return res
