public class BinarySearchTree {
    private Node root;

    /**
     * Inserts a key into this binary search tree.
     * If there are n nodes in the tree, then the average runtime of this method should be log(n).
     *
     * @param key The key to insert.
     */
    private Node insertRoot(int key,Node root) {
        if(root==null) {
            Node newnode= new Node(key);
            return newnode;
        }
        if(key<root.key) {
            root.left=insertRoot(key,root.left);
        }
        else if(key>=root.key) {
            root.right=insertRoot(key,root.right);
        }
        return root;
    }
    public void insert(int key) {
        // Please implement this method.
        root=insertRoot(key,root);
    }

    /**
     * Checks whether or not a key exists in this binary search tree.
     * If there are n nodes in the tree, then the average runtime of this method should be log(n).
     *
     * @param key The key to check for.
     * @return true if the key is present in this binary search tree, false otherwise.
     */
    private boolean findRoot(Node root,int key) {
        if(root==null) {
            return false;
        }
        if(root.key==key) {
            return true;
        }
        else if(key>root.key) {
            return findRoot(root.right,key);
        }
        else if(key<root.key) {
            return findRoot(root.left,key);
        }
        return false;
    }

    public boolean find(int key) {
        // Please implement this method.
    }

    public static class Node {
        public int key;
        public Node left;
        public Node right;

        public Node(int item) {
            key=item;
            left=null;
            right=null;
        }
    }
}


