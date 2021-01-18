public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    public void add(String data) {
        if (isEmpty()) { // membuat root baru
            root = new Node(data);
        } else {
            Node point = root; // data
            while (true) {
                if (data.charAt(0) < point.data.charAt(0)) {
                    if (point.left != null) {
                        point = point.left; // data bergerak ke kiri
                    } else {
                        point.left = new Node(data); // membuat cabang baru
                        break;
                    }
                } else {
                    if (point.right != null) {
                        point = point.right; // data bergerak ke kanan
                    } else {
                        point.right = new Node(data); // membuat cabang baru
                        break;
                    }
                }
            }
        }
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(" " + node.data);
            inOrder(node.right);
        }
    }
}