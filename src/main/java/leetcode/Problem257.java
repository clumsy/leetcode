package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem257 {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<String> paths = new ArrayList<>();
        collectBinaryTreePaths(root, "", paths);
        return paths;
    }

    private void collectBinaryTreePaths(TreeNode root, String prefix, List<String> paths) {
        prefix += root.val;
        if (root.left == null && root.right == null) {
            paths.add(prefix);
            return;
        }
        if (root.left != null) {
            collectBinaryTreePaths(root.left, prefix + "->", paths);
        }
        if (root.right != null) {
            collectBinaryTreePaths(root.right, prefix + "->", paths);
        }
    }
}
