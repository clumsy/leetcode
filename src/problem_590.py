# class Solution:
#     def postorder(self, root: Node) -> List[int]:
#         res = []
#         def _postorder(node):
#             if node is None:
#                 return
#             for c in node.children:
#                 _postorder(c)
#             res.append(node.val)
#         _postorder(root)
#         return res


class Solution:
    def postorder(self, root: "Node") -> List[int]:
        res, q = ([], [root])
        while q:
            node = q.pop()
            res.append(node.val)
            q.extend(node.children)
        res = res[::-1]
        return res
