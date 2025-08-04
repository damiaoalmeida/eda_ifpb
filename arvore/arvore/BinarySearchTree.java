package arvore;

class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    // Método para inserir um valor na árvore BST
    void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node father, int value) {
        if (father == null) {
            return new Node(value);
        }
        if (value < father.value) {
            father.left = insertRec(father.left, value);
        } else if (value > father.value) {
            father.right = insertRec(father.right, value);
        }
        return father;
    }

    // Pré-Ordem (Root -> Left -> Right)
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // In-Ordem (Left -> Root -> Right) - Retorna a árvore ordenada
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }

    // Pós-Ordem (Left -> Right -> Root)
    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        // Inserindo elementos na árvore binária de busca
        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        for (int val : valores) {
            bst.insert(val);
        }

        System.out.print("Pré-Ordem: ");
        bst.preOrder(bst.root);
        System.out.println();

        System.out.print("In-Ordem: ");
        bst.inOrder(bst.root);
        System.out.println();

        System.out.print("Pós-Ordem: ");
        bst.postOrder(bst.root);
        System.out.println();
    }
}