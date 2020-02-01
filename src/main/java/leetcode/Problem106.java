package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0, inLength = inorder.length; i < inLength; i++) {
            inMap.put(inorder[i], i);
        }
        return construct(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1, inMap);
    }

    private TreeNode construct(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if (postStart > postEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;
        root.left = construct(postorder, postStart, postStart + numsLeft - 1, inorder, inStart, inRoot - 1, inMap);
        root.right = construct(postorder, postStart + numsLeft, postEnd - 1, inorder, inRoot + 1, inEnd, inMap);
        return root;
    }
}
