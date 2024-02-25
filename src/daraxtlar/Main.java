package daraxtlar;
class Node {
    int data;
    Node left, right;
    Node(int value) {
        data = value;
        left = right = null;
    }
}
class BinaryTree {
    Node root;
    BinaryTree(int value) {
        root = new Node(value);
    }
    void insert(int value) {
        root = insertRecursive(root, value);
    }
    Node insertRecursive(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.data) {
            node.left = insertRecursive(node.left, value);
        }
        else if (value > node.data) {
            node.right = insertRecursive(node.right, value);
        }
        return node;
    }
    void print(String order) {
        printRecursive(root, order);
    }
    void printRecursive(Node node, String order) {
        if (node == null) {
            return;
        }
        if (order.equals("pre-order")) {
            System.out.print(node.data + " ");
            printRecursive(node.left, order);
            printRecursive(node.right, order);
        }
        else if (order.equals("in-order")) {
            printRecursive(node.left, order);
            System.out.print(node.data + " ");
            printRecursive(node.right, order);
        }
        else if (order.equals("post-order")) {
            printRecursive(node.left, order);
            printRecursive(node.right, order);
            System.out.print(node.data + " ");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(45);
        tree.insert(55);
        tree.insert(69);
        tree.insert(32);
        tree.insert(89);
        tree.insert(41);
        tree.insert(56);
        tree.insert(63);
        tree.insert(22);
        tree.insert(45);
        System.out.println("The binary tree elements in pre-order are:");
        tree.print("pre-order");
        System.out.println();
        System.out.println("The binary tree elements in in-order are:");
        tree.print("in-order");
        System.out.println();
        System.out.println("The binary tree elements in post-order are:");
        tree.print("post-order");
        System.out.println();
    }
}
