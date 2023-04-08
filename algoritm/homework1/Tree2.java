import java.util.ArrayList;
import java.util.List;

/*
 * Обход в ширину
 */
public class Tree2 {
    Node root;

    public boolean exist(int value) {
        if (root != null) {
            Node node = find(value);
            if (node != null) {
                return true;
            }
        }
        return false;
    }

    private Node find(int value) {
        List<Node> Line = new ArrayList<>();
        Line.add(root);
        while (Line.size() > 0) {
            List<Node> nextLine = new ArrayList<>();
            for (Node node : Line) {
                if (node.value == value) {
                    return node;
                }
                nextLine.addAll(node.children);

            }
            Line = nextLine;
        }
        return null;
    }

    public class Node {
        int value;
        List<Node> children;

    }
}
