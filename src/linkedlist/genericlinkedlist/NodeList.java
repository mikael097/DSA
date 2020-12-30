package linkedlist.genericlinkedlist;

public class NodeList<T extends Comparable<T>> {
    private T data;
    private NodeList<T> next;

    public T getData() {
        return data;
    }

    public NodeList<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(NodeList<T> next) {
        this.next = next;
    }
    @Override
    public String toString(){
        return this.data.toString();
    }
}
