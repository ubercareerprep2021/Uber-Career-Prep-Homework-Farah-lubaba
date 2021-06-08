public class PhoneBookTree implements PhoneBook {
    private Node root;
    public int treesize(Node root) {
        if(root==null) {
            return 0;
        }
        return treesize(root.left)+treesize(root.right)+1;
    }
    @Override
    public int size() {
        return treesize(root);
    }

    @Override
    public void insert(String name,long phoneNumber) {
        root=insertRoot(name,phoneNumber,root);
    }
    private Node insertRoot(String name, long phoneNumber,Node root) {
        if(root==null) {
            Node newnode= new Node(name,phoneNumber);
            return newnode;
        }
        if(phoneNumber<root.phoneNumber) {
            root.left=insertRoot(name,phoneNumber,root.left);
        }
        else if(phoneNumber>=root.phoneNumber) {
            root.right=insertRoot(name,phoneNumber,root.right);
        }
        return root;
    }

    @Override
    public long find(String name) {
        if (root==null || root.name==name)
            return root.phoneNumber;

        // Key is greater than root's key
        if (root.name.compareTo(name)>0)
            return find(name);
        

        // Key is smaller than root's key
        return find(name);
    }
    public static class Node {
        public String name;
        public long phoneNumber;
        public Node left;
        public Node right;

        public Node(String myName,long myNumber) {
            name=myName;
            phoneNumber=myNumber;
            left=null;
            right=null;
        }
    }
}
