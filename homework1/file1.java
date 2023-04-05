// package homework1;

// import java.awt.Color;



// public class file1<V extends Comparable<V>> {
//     private Node root;

//     public static void main(String[] args) {
//         file1<Integer> file = new file1<>();
//         file.add(5);
//         file.add(3);
//         file.add(1);
//         file.add(4);
//         file.add(7);
//         file.add(6);
//         file.add(8);
//     }

//     public boolean add(V value) {
//         if (root != null) {
//             boolean result = addNode(root, value);
//             root = rebalance(root);
//             root.color = Color.BLACK;
//             return result;
//         } else {
//             root = new Node();
//             root.color = Color.BLACK;
//             root.value = value;
//             return true;
//         }
//     }

//     private boolean addNode(Node node, V value) {
//         if (node.value == value) {
//             return false;
//         } else {
//             if (node.value.compareTo(value) > 0) {
//                 if (node.left != null) {
//                     return addNode(node.left, value);
//                 } else {
//                     Node newNode = new Node();
//                     newNode.color = Color.RED;
//                     newNode.value = value;
//                     newNode.parent = node;
//                     node.left = newNode;
//                     return true;
//                 }
//             } else {
//                 if (node.right != null) {
//                     return addNode(node.right, value);
//                 } else {
//                     Node newNode = new Node();
//                     newNode.color = Color.RED;
//                     newNode.value = value;
//                     newNode.parent = node;
//                     node.right = newNode;
//                     return true;
//                 }
//             }
//         }
//     }

//     private Node rebalance(Node node) {
//         if (node.parent == null) {
//             node.color = Color.BLACK;
//             return node;
//         } else if (node.parent.color == Color.BLACK) {
//             return node;
//         } else {
//             Node grandparent = node.parent.parent;
//             Node uncle = getUncle(node);

//             if (uncle != null && uncle.color == Color.RED) {
//                 node.parent.color = Color.BLACK;
//                 uncle.color = Color.BLACK;
//                 grandparent.color = Color.RED;
//                 return rebalance(grandparent);
//             } else {
//                 if (node == node.parent.right && node.parent == grandparent.left) {
//                     rotateLeft(node.parent);
//                     node = node.left;
//                 } else if (node == node.parent.left && node.parent == grandparent.right) {
//                     rotateRight(node.parent);
//                     node = node.right;
//                 }

//                 node.parent.color = Color.BLACK;
//                 grandparent.color = Color.RED;

//                 if (node == node.parent.left && node.parent == grandparent.left) {
//                     return rotateRight(grandparent);
//                 } else {
//                     return rotateLeft(grandparent);
//                 }
//             }
//         }
//     }

//     private Node getUncle(Node node) {
//         Node grandparent = node.parent.parent;
//         if (grandparent == null) {
//             return null;
//         } else if (node.parent == grandparent.left) {
//             return grandparent.right;
//         } else {
//             return grandparent.left;
//         }
//     }

//     private void rotateLeft(Node node) {
//         Node pivot = node.right;
//         pivot.parent = node.parent;
//         if (node.parent != null) {
//             if (node.parent.left == node) {
//                 node.parent.left = pivot;
//             } else {
//                 node.parent.right = pivot;
//             }
//         }

//         node.right = pivot.left;
//         if (pivot.left != null) {
//             pivot.left.parent = node;
//         }

//         node.parent = pivot;
//         pivot.left = node;

//         if (node == root) {
//             root = pivot;
//         }
//     }

//     private void rotateRight(Node node) {
//         Node pivot = node.left;
//         pivot.parent = node.parent;
//         if (node.parent != null) {
//             if (node.parent.left == node) {
//                 node.parent.left = pivot;
//             } else {
//                 node.parent.right = pivot;
//             }
//         }
//     }
// }