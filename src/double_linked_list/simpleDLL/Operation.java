package double_linked_list.simpleDLL;

public interface Operation {
    DLLNode create(int data);
    void insertAtBegin(int data);
    void displayHead();
    void displayTail();
    void insertAtEnd(int data);
    void insertAtPosition(int pos, int data);
}
