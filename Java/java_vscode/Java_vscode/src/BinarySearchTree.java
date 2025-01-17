public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int key, carro carro) {
        root = insertRec(root, key, carro);
    }

    private TreeNode insertRec(TreeNode node, int key, carro carro) {
        if (node == null) {
            node = new TreeNode(key, carro);
            return node;
        }

        if (key < node.key) {
            node.left = insertRec(node.left, key, carro);
        } else {
            node.right = insertRec(node.right, key, carro);
        }
        return node;
    }

    public carro search(int key) {
        return searchRec(root, key);
    }

    private carro searchRec(TreeNode node, int key) {
        if (node == null) {
            return null;
        }

        if (key == node.key) {
            return node.carro;
        }

        if (key < node.key) {
            return searchRec(node.left, key);
        } else {
            return searchRec(node.right, key);
        }
    }

    public void remove(int key) {
        root = removeRec(root, key);
    }

    private TreeNode removeRec(TreeNode node, int key) {
        if (node == null) {
            return null;
        }

        if (key < node.key) {
            node.left = removeRec(node.left, key);
        } else if (key > node.key) {
            node.right = removeRec(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            TreeNode minLargerNode = getMin(node.right);
            node.key = minLargerNode.key;
            node.carro = minLargerNode.carro;
            node.right = removeRec(node.right, minLargerNode.key);
        }
        return node;
    }

    private TreeNode getMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void printInOrder() {
        printInOrderRec(root);
    }

    private void printInOrderRec(TreeNode node) {
        if (node != null) {
            printInOrderRec(node.left);
            System.out.println("Chave: " + node.key + ", " + node.carro);
            printInOrderRec(node.right);
        }
    }
}
