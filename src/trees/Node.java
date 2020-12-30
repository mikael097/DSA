package trees;

import java.util.ArrayList;

public class Node<T extends Number> {
    private T data;
    private final ArrayList<Node<T>> children=new ArrayList<>();

    public T getData() {
        return data;
    }

    public ArrayList<Node<T>> getChildren() {
        return children;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setChildren(Node<T> child) {
        children.add(child);
    }
    @Override
    public String toString() {
        return  data.toString();
    }
}
