import java.util.NoSuchElementException;
import java.util.ArrayList;

public class Stack {

    private ArrayList<Integer> items;

    public Stack() {
        items = new ArrayList<Integer>();
    }

    /**
     * Pushes item on top of stack
     *
     * @param item Item to be added
     */
    public void push(int item) {
        items.add(item);  // array list will add to end
    }

    public int pop()
            throws NoSuchElementException {
        try {
            return items.remove(items.size()-1);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException();
        }
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public int top() {
        return items.get(items.size()-1);
    }

}