class Solution:
    def replaceValueInTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        lvl = defaultdict(int)

        def level_sum(node, l=0):
            if node is None:
                return
            lvl[l] = lvl[l] + node.val
            level_sum(node.left, l + 1)
            level_sum(node.right, l + 1)

        def update_sum(node, s, l=0):
            if node is None:
                return
            node.val = lvl[l] - s
            s = 0
            s = s + (node.left.val if node.left else 0)
            s = s + (node.right.val if node.right else 0)
            update_sum(node.left, s, l + 1)
            update_sum(node.right, s, l + 1)
        level_sum(root)
        update_sum(root, root.val)
        return root

# class Solution:
#     def replaceValueInTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
#         q = deque([(bogus := TreeNode(0, left=root))])
#         lvl = []
#         while q:
#             s = 0
#             for _ in range(len(q)):
#                 node = q.pop()
#                 if node.left:
#                     s = s + node.left.val
#                     q.appendleft(node.left)
#                 if node.right:
#                     s = s + node.right.val
#                     q.appendleft(node.right)
#             lvl.append(s)
#         q, l = (deque([bogus]), 0)
#         while q:
#             for _ in range(len(q)):
#                 node = q.pop()
#                 v = lvl[l] - (node.left.val if node.left else 0) - (node.right.val if node.right else 0)
#                 if node.left:
#                     node.left.val = v
#                     q.appendleft(node.left)
#                 if node.right:
#                     node.right.val = v
#                     q.appendleft(node.right)
#             l = l + 1
#         return root
