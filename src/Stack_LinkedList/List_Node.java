package Stack_LinkedList;

public class List_Node<T extends Number> {
    private T value;
    private List_Node<T> next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List_Node<T> getNext() {
        return next;
    }

    public void setNext(List_Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.value+" ";
    }
}
