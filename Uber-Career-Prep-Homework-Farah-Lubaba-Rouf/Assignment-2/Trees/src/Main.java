public class Main {
    public static void print(Tree.TreeNode n) {
        if (n == null)
            return;
        print(n.left);
        System.out.println(n.data);
        print(n.right);
    }
    public static void main(String[] args) {
        Tree.TreeNode leftChild = new Tree.TreeNode(6, null, null);
        Tree.TreeNode rightChild = new Tree.TreeNode(3, null, null);
        Tree.TreeNode left = new Tree.TreeNode(7, null, null);
        Tree.TreeNode right = new Tree.TreeNode(17, leftChild, rightChild);
        Tree.TreeNode root = new Tree.TreeNode(1, left, right);
        Tree tree = new Tree(root);
        print(root);


    }
}


