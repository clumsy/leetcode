package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Problem133 {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Node result = new Node(node.val);
        Queue<Node> nodes = new LinkedList<>();
        Map<Integer, Node> visited = new HashMap<>();
        visited.put(node.val, result);
        nodes.add(node);
        while (!nodes.isEmpty()) {
            Node current = nodes.remove();
            Node currentCopy = visited.get(current.val);
            for (Node neighbor : current.children) {
                Node neighborCopy = visited.get(neighbor.val);
                if (neighborCopy == null) {
                    neighborCopy = new Node(neighbor.val);
                    nodes.add(neighbor);
                    visited.put(neighbor.val, neighborCopy);
                }
                currentCopy.children.add(neighborCopy);
            }
        }
        return result;
    }
}
