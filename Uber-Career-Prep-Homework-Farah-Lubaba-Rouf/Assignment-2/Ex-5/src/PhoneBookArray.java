import java.util.ArrayList;
public class PhoneBookArray implements PhoneBook {
    private ArrayList<Node> list = new ArrayList<>();
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void insert(String name,long phoneNumber) {
        Node newnumber=new Node(name,phoneNumber);
        list.add(newnumber);
    }

    @Override
    public long find(String name) {
        if(list.contains(name)){
            long pnumber = list.get(name).phoneNumber;
            return pnumber;
        }
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
