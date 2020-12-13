package Stack_LinkedList;

public interface Operation<T extends Number> {
    void push(T x);
    T pop();
    T peek();
    void display();
}
