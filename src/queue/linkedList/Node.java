package queue.linkedList;

public class Node<T extends Number>  {
    private T val;
    private Node<T> next;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return val+" ";
    }
}
