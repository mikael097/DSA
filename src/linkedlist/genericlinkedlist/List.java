package linkedlist.genericlinkedlist;

public interface List<T> {
     void insertAtBegin(T data);
     void insertAtEnd(T data);
     void insertAtPosition(T data,int position);
     void removeAtBegin();
     void removeAtEnd();
     void removeAtPosition(int position);
     void traverse();
     boolean search(T data);
}
