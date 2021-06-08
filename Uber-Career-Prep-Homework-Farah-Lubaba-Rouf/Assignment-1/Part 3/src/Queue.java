import java.util.NoSuchElementException;
/*
 * A queue implemented using a Circular Linked List
 */
public class Queue <T> {

    Node<T> rear;
    int size;

    public Queue () {
        rear = null;
        size = 0;
    }
    public void enqueue(T item) {

        Node<T> newItem = new Node<T>(item, null);

        if (rear == null) {
            newItem.next = newItem;
        } else {
            newItem.next = rear.next;
            rear.next = newItem;
        }
        rear = newItem;
        size++;
    }

    public T dequeue() throws NoSuchElementException {

        if (rear == null) {
            throw new NoSuchElementException("queue is empty");
        } else if (rear == rear.next) {
            T data = rear.data;
            rear = null;
            size--;
            return data;
        } else {
            T data = rear.next.data;
            rear.next = rear.next.next;
            size--;
            return data;
        }
    }

    public T peek()  {

        return rear.next.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T rear() {
        return rear.data;
    }
}