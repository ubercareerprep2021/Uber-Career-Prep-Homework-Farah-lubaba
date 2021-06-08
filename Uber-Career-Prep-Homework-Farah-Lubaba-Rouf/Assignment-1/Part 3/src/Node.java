public class Node<T> {

    T data;        // data will be of type T
    Node<T> next;  // next will reference a node of type Node<T>

    public Node (T d, Node<T> n) {
        data = d;
        next = n;
    }
}