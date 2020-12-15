package queue.linkedList;

public interface Operations<T extends Number> {
    void insert(T x);
    Node<T> remove();
    void display();
}
