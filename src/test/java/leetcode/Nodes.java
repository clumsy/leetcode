package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Nodes {
    public static Node of(Integer... nodes) {
        Node root = new Node(nodes[0], new ArrayList<>());
        Queue<Node> nodesToAdd = new ArrayDeque<>();
        nodesToAdd.add(root);
        int offset = 2;
        while (!nodesToAdd.isEmpty()) {
            Node node = nodesToAdd.remove();
            while (offset < nodes.length && nodes[offset] != null) {
                Node child = new Node(nodes[offset++], new ArrayList<>());
                node.children.add(child);
                nodesToAdd.offer(child);
            }
            offset++;
        }
        return root;
    }
}
