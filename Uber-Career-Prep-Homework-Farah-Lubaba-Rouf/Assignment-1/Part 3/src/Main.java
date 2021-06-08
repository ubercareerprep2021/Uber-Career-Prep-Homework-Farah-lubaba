public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello");
        Stack mystack=new Stack();
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        System.out.println(mystack.top());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());

        Queue myqueue=new Queue();
        myqueue.enqueue(1);
        myqueue.enqueue(2);
        myqueue.enqueue(3);
        System.out.println("size of queue");
        System.out.println(myqueue.size());
        System.out.println("front of quwue");
        System.out.println(myqueue.peek());
        System.out.println("rear" + myqueue.rear());
        int dequeued = (int) myqueue.dequeue();
        System.out.println("dequeued" + dequeued);


    }
}
